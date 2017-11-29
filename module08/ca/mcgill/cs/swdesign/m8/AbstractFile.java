package ca.mcgill.cs.swdesign.m8;

/**
 * An abstract class for all nodes in the file system hierarchy.
 * @author Halil Murat
 *
 */
public abstract class AbstractFile implements IFile
{
	private String aName;
	private int aLevel;

	/**
	 * Constructor.
	 * @param pName		name of the object
	 * @param pLevel	an integer represent how low the object is in the file hierarchy
	 */
	protected AbstractFile(String pName, int pLevel)
	{
		aName = pName;
		aLevel = pLevel;
	}
	
	@Override
	public String getName()
	{
		return aName;
	}
	
	@Override
	public int getLevel()
	{
		return aLevel;
	}
}
