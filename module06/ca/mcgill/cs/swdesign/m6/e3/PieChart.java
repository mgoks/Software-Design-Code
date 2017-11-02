/**
 * 
 */
package ca.mcgill.cs.swdesign.m6.e3;

/**
 * @author Halil Murat
 *
 */
public class PieChart implements RemovalObserver, AdditionObserver
{
	@Override
	public void ItemAdded(Item pItem)
	{
		System.out.println("Added " + pItem.toString() + " to pie chart.");
	}

	@Override
	public void itemRemoved(Item pItem)
	{
		System.out.println("Removed " + pItem.toString() + " from pie chart.");
	}
}