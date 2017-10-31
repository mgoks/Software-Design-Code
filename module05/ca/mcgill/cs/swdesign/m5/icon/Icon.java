package ca.mcgill.cs.swdesign.m5.icon;

import java.awt.Component;
import java.awt.Graphics;

/**
 * @author Halil Murat
 */
public interface Icon
{
	/**
	 * 
	 * @return the width of the icon
	 */
	int getIconWidth();
	
	/**
	 * 
	 * @return the height of the icon
	 */
	int getIconHeight();
	
	/**
	 * 
	 * @param pComponent
	 * @param pGraphics
	 * @param pX			x-coordinate
	 * @param pY			y-coordinate
	 */
	void paintIcon(Component pComponent, Graphics pGraphics, int pX, int pY);
}
