package ca.mcgill.cs.swdesign.m5.icon.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.mcgill.cs.swdesign.m5.icon.Card;
import ca.mcgill.cs.swdesign.m5.icon.CardImages;
import ca.mcgill.cs.swdesign.m5.icon.CompositeIcon;
import ca.mcgill.cs.swdesign.m5.icon.ShiftedIcon;
import ca.mcgill.cs.swdesign.m5.icon.Card.Rank;
import ca.mcgill.cs.swdesign.m5.icon.Card.Suit;

public class TestCompositeIcon
{
	@Test
	public void testGetIconHeight()
	{
		Card card = new Card(Rank.ACE, Suit.SPADES);
		CompositeIcon icon = new CompositeIcon();
		icon.addIcon( new ShiftedIcon(CardImages.getCard(card), 0, 0) );
		assertEquals(97, icon.getIconHeight());
		
		card = new Card(Rank.ACE, Suit.CLUBS);
		icon.addIcon( new ShiftedIcon(CardImages.getCard(card), 10, 10) );
		assertEquals(107, icon.getIconHeight());
	}

	@Test
	public void testGetIconWidth()
	{
		Card card = new Card(Rank.ACE, Suit.SPADES);
		CompositeIcon icon = new CompositeIcon();
		icon.addIcon( new ShiftedIcon(CardImages.getCard(card), 0, 0) );
		assertEquals(73, icon.getIconWidth());
		
		card = new Card(Rank.ACE, Suit.CLUBS);
		icon.addIcon( new ShiftedIcon(CardImages.getCard(card), 10, 10) );
		assertEquals(83, icon.getIconWidth());
	}

}
