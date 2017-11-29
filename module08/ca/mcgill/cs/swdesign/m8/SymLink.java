package ca.mcgill.cs.swdesign.m8;

/**
 * @author Halil Murat
 */
public class SymLink extends AbstractFile
{
	private IFile aIFile;
	
	/**
	 * @param pName		name of SymLink
	 * @param pLevel	level of SymLink
	 * @param pIFile	IFile this SymLink aggregates
	 */
	protected SymLink(String pName, int pLevel, IFile pIFile)
	{
		super(pName, pLevel);
		aIFile = pIFile;
	}

	@Override
	public void accept(FileSystemVisitor pVisitor)
	{
		pVisitor.visitSymLink(this);
	}

}
