/**
 * 
 */
package ca.mcgill.cs.swdesign.m6.e3;

/**
 * @author Halil Murat
 * Observer implementation that enables to show the item in the inventory in a list view.
 */
public class ListView implements AdditionObserver, RemovalObserver
{
	@Override
	public void ItemAdded(Item pItem)
	{
		System.out.println("Added " + pItem.toString() + " to list view.");
	}

	@Override
	public void itemRemoved(Item pItem)
	{
		System.out.println("Removed " + pItem.toString() + " from list view.");
	}
}