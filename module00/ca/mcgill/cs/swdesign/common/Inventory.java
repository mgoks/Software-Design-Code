package ca.mcgill.cs.swdesign.common;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Represents the inventory of a 
 * physical grocery store.
 */
public class Inventory extends Identity implements Iterable<IItem>, IVisitable
{
	private final HashMap<IItem, Integer> aInventory = new HashMap<>();
	private ILogger aILogger = new ConsoleLogger();
	
	/**
	 * Creates a new inventory with no items in it,
	 * and identified uniquely with pName.
	 * @param pName A unique identifier for this inventory.
	 */
	protected Inventory(String pName)
	{
		super(pName);
	}
	
	/**
	 * Adds pQuantity number of items to the inventory.
	 * @param pItem The type of item to add.
	 * @param pQuantity The amount to add.
	 */
	public void stock(IItem pItem, int pQuantity)
	{
		int amount = 0;
		if( aInventory.containsKey(pItem))
		{
			amount = aInventory.get(pItem);
		}
		amount += pQuantity;
		aInventory.put(pItem, amount);
		
		notifyStockObservers(pItem, pQuantity);
	}
	
	/**
	 * Removes pQuantity of items from the inventory,
	 * for example by selling them or tossing them in
	 * the garbage.
	 * @param pItem The type of item to dispose of
	 * @param pQuantity The amount to dispose.
	 * @pre aInventory.containsKey(pItem) && pQuantity >= aInventory.get(pItem)
	 */
	public void dispose(IItem pItem, int pQuantity)
	{
		int amount = aInventory.get(pItem);
		amount -= pQuantity;
		aInventory.put(pItem, amount);
		
		notifyDisposalObservers(pItem, pQuantity);
	}
	
	/**
	 * @param pItem The item to check for availability.
	 * @return How many of the items are available in the inventory.
	 */
	public int available(IItem pItem)
	{
		if( aInventory.containsKey(pItem))
		{
			return aInventory.get(pItem);
		}
		else
		{
			return 0;
		}
	}

	@Override
	public Iterator<IItem> iterator()
	{
		return aInventory.keySet().iterator();
	}
	
	private void notifyStockObservers(IItem pItem, int pQuantity)
	{
		for (int i = 0; i < pQuantity; i++)
		{
			aILogger.itemStocked(pItem);
		}
	}
	
	private void notifyDisposalObservers(IItem pItem, int pQuantity)
	{
		for (int i = 0; i < pQuantity; i++)
		{
			aILogger.itemDisposed(pItem);
		}
	}

	@Override
	public void accept(IVisitor pVisitor)
	{
		pVisitor.visitInventory(this);
	}
}
