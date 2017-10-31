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
	private final int aX;
	private final int aY;
	
	/**
	 * Constructor.
	 * @param pIcon	the icon to be shifted
	 * @param pX	the magnitude of the shift on the x-axis
	 * @param pY	the magnitude of the shift on the y-axis
	 */
	public ShiftedIcon(Icon pIcon, int pX, int pY)
	{
		aIcon = pIcon;
		aX = pX;
		aY = pY;
	}

	@Override
	public void paintIcon(Component pComponent, Graphics pGraphics, int pX, int pY)
	{
		// aIcon is decorated by shifting it by aX in x-axis and aY in y-axis
		aIcon.paintIcon(pComponent, pGraphics, pX + aX, pY + aY);
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
	
	/**
	 * @return	shift in X-axis
	 */
	public int getShiftInX()
	{
		return aX;
	}
	
	/**
	 * @return	shift in Y-axis
	 */
	public int getShiftInY()
	{
		return aY;
	}
}
