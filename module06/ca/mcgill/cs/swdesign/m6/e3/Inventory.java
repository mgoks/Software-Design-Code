package ca.mcgill.cs.swdesign.m6.e3;

import java.util.ArrayList;
import java.util.List;

/**
 * An Inventory object aggregates a bunch of Items. 
 * Clients can add or remove Items from the Inventory 
 * at any time. 
 * Various entities are interested in changes to the 
 * state of the Inventory, e.g. PieChart, ListView.
 * @author Halil Murat
 *
 */
public class Inventory
{
	private List<Item> aItems = new ArrayList<>();
	private List<AdditionObserver> aAdditionObservers = new ArrayList<>();
	private List<RemovalObserver>  aRemovalObservers  = new ArrayList<>();
	
	public void addItem(Item pItem)
	{
		assert pItem != null;
		this.notifyAdditionObservers(pItem);
		aItems.add(pItem);
	}
	
	public void removeItem(Item pItem)
	{
		assert pItem != null;
		this.notifyRemovalObservers(pItem);
		aItems.remove(pItem);
	}
	
	public void addAdditionObserver( AdditionObserver pObserver )
	{
		assert pObserver != null;
		aAdditionObservers.add(pObserver);
	}
	
	public void removeAdditionObserver( AdditionObserver pObserver )
	{
		assert pObserver != null;
		aAdditionObservers.remove(pObserver);
	}
	
	private void notifyAdditionObservers(Item pItem)
	{
		assert pItem != null;
		for( AdditionObserver observer : aAdditionObservers )
		{
			observer.ItemAdded(pItem);
		}
	}
	
	public void addRemovalObserver( RemovalObserver pObserver)
	{
		assert pObserver != null;
		aRemovalObservers.add(pObserver);
	}
	
	public void removeRemovalObserver( RemovalObserver pObserver )
	{
		assert pObserver != null;
		aRemovalObservers.remove(pObserver);
	}
	
	private void notifyRemovalObservers(Item pItem)
	{
		assert pItem != null;
		for( RemovalObserver observer : aRemovalObservers )
		{
			observer.itemRemoved(pItem);
		}
	}
	
	public static void main(String[] args)
	{
		Inventory inventory = new Inventory();
		PieChart pieChart = new PieChart();
		ListView listView = new ListView();
		TransactionLogger logger = new TransactionLogger();
		inventory.addAdditionObserver(pieChart);
		inventory.addAdditionObserver(listView);
		inventory.addAdditionObserver(logger);
		inventory.addRemovalObserver(pieChart);
		inventory.addRemovalObserver(listView);
		
		Item item1 = new Item(001, 2017);
		Item item2 = new Item(002, 2017);
		inventory.addItem(item1);
		inventory.addItem(item2);
		inventory.removeItem(item1);
	}
}
