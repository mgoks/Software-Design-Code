package ca.mcgill.cs.swdesign.m5.icon;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;

/**
 * A CompositeIcon object can contain multiple ShiftedIcons.
 * Aggregates ShiftedIcon
 */
public class CompositeIcon implements Icon
{
	private List<ShiftedIcon> aIcons = new ArrayList<>();
	
	/**
	 * Constructor.
	 */
	public CompositeIcon()
	{}
	
	/**
	 * 
	 * @param pIcon		icon to be added to the CompositeIcon object
	 * @param pShiftX	magnitude of shift in x-axis
	 * @param pShiftY	magnitude of shift in y-axis
	 */
	public void add(Icon pIcon, int pShiftX, int pShiftY)
	{
		aIcons.add(new ShiftedIcon(pIcon, pShiftX, pShiftY));
	}
	
	/**
	 * @param pIcon		icon to be removed
	 */
	public void remove( Icon pIcon )
	{
		aIcons.remove(pIcon);
	}
	
	@Override
	public void paintIcon(Component pComponent, Graphics pGraphics, int pX, int pY)
	{
		int aX = 0; 
		int aY = 0;
		for( Icon icon : aIcons )
		{
			icon.paintIcon(pComponent, pGraphics, aX, aY);
			aX = icon.getIconWidth();
			aY = icon.getIconHeight();
		}
	}

	@Override
	public int getIconWidth()
	{
		int aCompositeIconWidth = 0;
		for( Icon icon : aIcons )
		{
			aCompositeIconWidth += icon.getIconWidth();
		}
		return aCompositeIconWidth;
	}

	@Override
	public int getIconHeight()
	{
		int aCompositeHeight = 0;
		for( Icon icon : aIcons )
		{
			aCompositeHeight += icon.getIconHeight();
		}
		return aCompositeHeight;
	}
}
