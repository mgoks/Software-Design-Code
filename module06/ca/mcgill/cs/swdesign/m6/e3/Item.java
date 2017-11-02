package ca.mcgill.cs.swdesign.m6.e3;

/**
 * An Item of equipment records a serial number (int) 
 * and production year (int).
 * @author Halil Murat
 *
 */
public class Item
{
	private int aSerialNumber;
	private int aYear;
	
	public Item( int pSerialNumber, int pYear )
	{
		aSerialNumber = pSerialNumber;
		aYear = pYear;
	}
	
	@Override
	public String toString()
	{
		return "Item#" + aSerialNumber;
	}
}
