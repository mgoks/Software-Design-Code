package ca.mcgill.cs.swdesign.m5.icon;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;

/**
 * A CompositeIcon object can contain multiple icons.
 * Aggregates ShiftedIcon
 */
public class CompositeIcon implements Icon
{
	private List<Icon> aIcons;
	
	/**
	 * 
	 * @param pIcons	list of icons to compose
	 */
	public CompositeIcon(Icon...pIcons)
	{
		aIcons = new ArrayList<>();
		int aXOffset = 0;
		for( Icon icon : pIcons )
		{
			// Icons will be drawn next to each other
			aIcons.add(new ShiftedIcon(icon, aXOffset, 0));
			aXOffset += icon.getIconWidth();
		}
	}

	@Override
	public void paintIcon(Component pC, Graphics pG, int pX, int pY)
	{
		for( Icon icon : aIcons )
		{
			icon.paintIcon(pC, pG, pX, pY);
		}
	}

	@Override
	public int getIconWidth()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIconHeight()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
