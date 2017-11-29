package ca.mcgill.cs.swdesign.m8;

/**
 * @author Halil Murat
 */
public class File extends AbstractFile
{
	/**
	 * @param pName		name of file
	 * @param pLevel	level of file
	 */
	protected File(String pName, int pLevel)
	{
		super(pName, pLevel);
	}

	@Override
	public void accept(FileSystemVisitor pVisitor)
	{
		pVisitor.visitFile(this);
	}
}
