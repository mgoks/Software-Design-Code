package ca.mcgill.cs.swdesign.m5;

import java.util.Iterator;

/**
 * A show that is introduced by a guest speaker. Realizes the
 * role of a concrete decorator in the Decorator design pattern.
 */
public class ConferenceShow implements Show
{
	private Show aDecorated;
	private int aTime;
	private String aSpeaker;
	
	/**
	 * @param pSpeaker The name of the speaker.
	 * @param pTime The amount of time the speaker will speak.
 	 * @param pDecorated The show being discussed by the speaker.
	 */
	public ConferenceShow(String pSpeaker, int pTime, Show pDecorated)
	{
		aDecorated = pDecorated;
		aTime = pTime;
		aSpeaker = pSpeaker;
	}
	
	/* (non-Javadoc)
	 * Perform a deep copy of the object, resulting in a distinct object graph.
	 * @see java.lang.Object#clone()
	 * 
	 * Here, a deep copy of the object is required, 
	 * otherwise there would be two distinct decorators decorating the same object.
	 * To achieve multi-decoration, the proper way is to nest decorators.
	 */
	/**
	 * Returns a deep copy of implicitly parameterized ConferenceShow object.
	 */
	@Override
	public ConferenceShow clone()
	{
		try
		{
			ConferenceShow clone = (ConferenceShow) super.clone();
			// Nest decorators
			clone.aDecorated = this.aDecorated.clone();
			return clone;
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}
	
	@Override
	public Iterator<Movie> iterator()
	{
		return aDecorated.iterator(); // Example of undecorated delegation.
	}

	@Override
	public String description()
	{
		return String.format("%s introducing %s", aSpeaker, aDecorated.description());
	}

	@Override
	public int runningTime()
	{
		return aTime + aDecorated.runningTime();
	}
}
