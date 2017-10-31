package ca.mcgill.cs.swdesign.m5.icon;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;

/**
 * To be completed.
 *
 */
public class CompositeIcon implements Icon
{
	private List<Icon> aIcons = new ArrayList<>();
	
	/**
	 * Constructor.
	 */
	public CompositeIcon()
	{}
	
	/**
	 * @param pIcons		list of icons to add to the CompositeIcon object
	 */
	public void addIcon(Icon...pIcons)
	{
		for( Icon icon : pIcons )
		{
			aIcons.add(icon);
		}
	}
	
	/**
	 * @param pIcons		list of icons to remove
	 */
	public void removeIcon(Icon...pIcons)
	{
		for( Icon icon : pIcons )
		{
			aIcons.remove(icon);
		}
	}
	
	@Override
	public void paintIcon(Component pComponent, Graphics pGraphics, int pX, int pY)
	{
		for( Icon icon : aIcons )
		{
			icon.paintIcon(pComponent, pGraphics, pX, pY);
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
