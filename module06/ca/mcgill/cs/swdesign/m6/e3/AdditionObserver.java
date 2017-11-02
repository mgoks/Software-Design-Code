package ca.mcgill.cs.swdesign.m6.e3;

/**
 * Observer interface that only cares about the items added.
 * @author Halil Murat
 *
 */
public interface AdditionObserver
{
	void ItemAdded(Item pItem);
}
