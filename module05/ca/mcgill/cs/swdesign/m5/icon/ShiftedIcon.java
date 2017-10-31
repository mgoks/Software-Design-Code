package ca.mcgill.cs.swdesign.m5.icon;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

/**
 * ShiftedIcon class supports drawing an icon as shifted by (parametric) x and y values.
 * Uses the Decorator design pattern.
 */
public class ShiftedIcon implements Icon
{
	private final Icon aIcon;
	private final int aShiftInX;
	private final int aShiftInY;
	
	/**
	 * 
	 * @param pIcon	Icon object, probably a ImageIcon
	 * @param pX	offset in X-axis
	 * @param pY	offset in Y-axis
	 */
	public ShiftedIcon(Icon pIcon, int pX, int pY)
	{
		aIcon = pIcon;
		aShiftInX = pX;
		aShiftInY = pY;
	}

	@Override
	public void paintIcon(Component pC, Graphics pG, int pX, int pY)
	{
		aIcon.paintIcon(pC, pG, pX + aShiftInX, pY + aShiftInY);
	}

	@Override
	public int getIconWidth()
	{
		return aIcon.getIconWidth();
	}

	@Override
	public int getIconHeight()
	{
		return aIcon.getIconHeight();
	}
}
