package ca.mcgill.cs.swdesign.m6.e3;

public class TransactionLogger implements AdditionObserver
{
	@Override
	public void ItemAdded(Item pItem)
	{
		System.out.println("Logged transaction of addition of " + pItem.toString());
	}
}
