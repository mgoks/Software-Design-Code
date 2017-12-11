package ca.mcgill.cs.swdesign.m8;

/**
 * Finds a file with a name passed as parameter to the, 
 * and deletes all its children, if the file 
 * is a directory or a symbolic link that refers to 
 * a directory.
 * 
 * @author Halil Murat
 */
public class DeleteVisitor implements Visitor
{
	@Override
	public void visitFile(File pFile)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		if (pSymLink.isDirectory())
		{
			pSymLink.getIFile().accept(this);
		}
	}

	/**
	 * Deletes all children of pDirectory.
	 */
	@Override
	public void visitDirectory(Directory pDirectory)
	{
		pDirectory.getChildren().clear();
		System.out.println("deleted all files in directory " + pDirectory.getName());
	}
	
	/**
	 * Searches a directory in file system.
	 * @param pDirName	name of the directory to find
	 * @param pRoot	the root directory of the file system
	 * @return	the directory if found, null otherwise
	 */
	private Directory findDir(String pDirName, Directory pRoot)
	{
		if (pDirName.equals(pRoot.getName()))
		{
			return pRoot;
		}
		else
		{
			for (Directory dir : pRoot.getSubDirs())
			{
				if (dir.getName().equals(pDirName))
				{
					return dir;
				}
			}
		}
		return null;
	}
}
