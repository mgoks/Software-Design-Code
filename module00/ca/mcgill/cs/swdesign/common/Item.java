package ca.mcgill.cs.swdesign.common;

/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
public class Item extends Identity implements IItem, IVisitable 
{
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	
	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	protected Item(String pName, int pId, int pPrice)
	{
		super(pName);
		aId = pId;
		aPrice = pPrice;
	}
	

	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}

	@Override
	public void accept(IVisitor pVisitor)
	{
		pVisitor.visitItem(this);
	}

}
