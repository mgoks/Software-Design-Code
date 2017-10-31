package ca.mcgill.cs.swdesign.m5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Halil Murat
 */
public class CompositeCommand implements Command
{
	private List<Command> aCommands = new ArrayList<>();
	
	/**
	 * Constructor:
	 * Adds all parameterized commands to the list of commands (aCommands).
	 * @param pCommands		The list of commands to compose
	 */
	public CompositeCommand(Command... pCommands)
	{
		for( Command command : pCommands )
		{
			aCommands.add(command);
		}
	}
	
	@Override
	public void execute()
	{
		for( Command command: aCommands )
		{
			command.execute();
		}
	}
}
