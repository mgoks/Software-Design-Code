/**
 * 
 */
package ca.mcgill.cs.swdesign.m5;

/**
 * @author Halil Murat
 * Exercise 7:
 * Enhance the design with the concept of a "logged command"
 * that logs any kind of command to the console after having executed it.
 */
public class LoggedCommand implements Command
{
	private final Command aCommand;
	private final String aMessage;
	
	/**
	 * @param pCommand is executed
	 * @param pMessage is the log to display on the console
	 */
	public LoggedCommand(Command pCommand, String pMessage)
	{
		aCommand = pCommand;
		aMessage = pMessage;
	}
	
	/* (non-Javadoc)
	 * @see ca.mcgill.cs.swdesign.m5.Command#execute()
	 */
	@Override
	public void execute()
	{
		aCommand.execute();
		// Decoration
		System.out.println(String.format("Executed command %s", aMessage));
	}

}
