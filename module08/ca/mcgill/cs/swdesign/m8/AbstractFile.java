package ca.mcgill.cs.swdesign.m8;

public abstract class AbstractFile implements IFile
{
	private String aName;
	
	protected AbstractFile(String pName)
	{
		aName = pName;
	}
	
	public String getName()
	{
		return aName;
	}
}
