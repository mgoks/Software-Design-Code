package ca.mcgill.cs.swdesign.m8;

/**
 * Prints the file, symbolic link, or the directory it visits.
 * Uses the Visitor Design Pattern.
 * @author Halil Murat
 */
public class PrintVisitor implements Visitor
{
	private static final String TAB = "  ";
	private static int depth		= 0;
	
	@Override
	public void visitFile(File pFile)
	{
		System.out.println(pFile.getName());
	}

	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		System.out.print(pSymLink.getName() + " - symlink to ");
		pSymLink.getIFile().accept(this);
	}

	@Override
	public void visitDirectory(Directory pDirectory)
	{
		System.out.println(pDirectory.getName());
		depth++;
		for (IFile child : pDirectory.getChildren())
		{
			for (int i = 0; i < depth; i++)
			{
				System.out.print(TAB);
			}
			child.accept(this);
		}
		depth--;
	}
}
