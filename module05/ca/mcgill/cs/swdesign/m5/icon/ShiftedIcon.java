/**
 * 
 */
package ca.mcgill.cs.swdesign.m5.icon;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

/**
 * @author Halil Murat
 *
 */
public class ShiftedIcon implements Icon
{
	private final Icon aShiftedIcon;
	private final int aX;
	private final int aY;
	
	public ShiftedIcon(Icon pIcon, int pX, int pY)
	{
		aShiftedIcon = pIcon;
		aX = pX;
		aY = pY;
	}

	/* (non-Javadoc)
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
	 */
	@Override
	public void paintIcon(Component pC, Graphics pG, int pX, int pY)
	{
		aShiftedIcon.paintIcon(pC, pG, pX + aX, pY + aY);
	}

	/* (non-Javadoc)
	 * @see javax.swing.Icon#getIconWidth()
	 */
	@Override
	public int getIconWidth()
	{
		assert aShiftedIcon != null;
		
		return aShiftedIcon.getIconWidth() + aX;
	}

	/* (non-Javadoc)
	 * @see javax.swing.Icon#getIconHeight()
	 */
	@Override
	public int getIconHeight()
	{
		assert aShiftedIcon != null;
		
		return aShiftedIcon.getIconHeight() + aY;
	}

}
