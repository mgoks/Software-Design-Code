/**
 * 
 */
package ca.mcgill.cs.swdesign.m5.icon.test;

import static org.junit.Assert.*;
import org.junit.Test;

import ca.mcgill.cs.swdesign.m5.icon.Card;
import ca.mcgill.cs.swdesign.m5.icon.CardImages;
import ca.mcgill.cs.swdesign.m5.icon.ShiftedIcon;
import ca.mcgill.cs.swdesign.m5.icon.Card.Rank;
import ca.mcgill.cs.swdesign.m5.icon.Card.Suit;

/**
 * @author Halil Murat
 *
 */
public class TestShiftedIcon
{

	@Test
	public void testGetIconHeight()
	{
		Card card = new Card(Rank.ACE, Suit.SPADES);
		ShiftedIcon icon = new ShiftedIcon( CardImages.getCard(card), 0, 0);
		assertEquals(97, icon.getIconHeight());
		icon = new ShiftedIcon( CardImages.getCard(card), 10, 10 );
		assertEquals(107, icon.getIconHeight());
//		fail("Not yet implemented");
	}

	@Test
	public void testGetIconWidth()
	{
		Card card = new Card(Rank.ACE, Suit.SPADES);
		ShiftedIcon icon = new ShiftedIcon( CardImages.getCard(card), 0, 0);
		assertEquals(73, icon.getIconWidth());
		icon = new ShiftedIcon( CardImages.getCard(card), 10, 10 );
		assertEquals(83, icon.getIconWidth());
	}
}
