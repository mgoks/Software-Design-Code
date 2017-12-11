package ca.mcgill.cs.swdesign.m8;

/**
 * Makes directories hidden.
 * Uses the Decorator Design Pattern.
 * @author Halil Murat
 */
public class VisibilityDecorator implements IFile
{
	private final Directory aHiddenDir;

	/**
	 * Constructs the VisibilityDecorator object.
	 * @param pDir	directory to hide
	 */
	public VisibilityDecorator(Directory pDir)
	{
		aHiddenDir = pDir;
	}

	@Override
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitDirectory(aHiddenDir);
	}

	@Override
	public String getName()
	{
		return "." + aHiddenDir.getName();
	}
}
