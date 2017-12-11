package ca.mcgill.cs.swdesign.m8;

public class SymLink implements IFile
{
	private IFile aIFile;
	private String aName;
	
	public SymLink(IFile pIFile, String pName)
	{
		aIFile = pIFile;
		aName  = pName;
	}

	@Override
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitSymLink(this);
//		aIFile.accept(pVisitor);
	}

	@Override
	public String getName()
	{
		return aName;
	}

	public IFile getIFile()
	{
		return aIFile;
	}
	
	public boolean isDirectory()
	{
		return aIFile instanceof Directory;
	}
}
