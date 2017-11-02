package ca.mcgill.cs.swdesign.m6.e3;

/**
 * Observer interface that only cares about the items removed.
 * @author Halil Murat
 *
 */
public interface RemovalObserver
{
	void itemRemoved(Item pItem);
}