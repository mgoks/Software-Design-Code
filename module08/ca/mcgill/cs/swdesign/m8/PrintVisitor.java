package ca.mcgill.cs.swdesign.m8;

import java.util.List;

/**
 * A concrete visitor that prints out the file hierarchy.
 * @author Halil Murat
 */
public class PrintVisitor implements FileSystemVisitor
{
	@Override
	public void visitFile(File pFile)
	{
		for (int i = 0; i < pFile.getLevel(); i++)
		{
			System.out.print("  ");
		}
		System.out.println(pFile.getName());
	}

	@Override
	public void visitDirectory(Directory pDirectory)
	{
		for (int i = 0; i < pDirectory.getLevel(); i++)
		{
			System.out.print("  ");
		}
		System.out.println(pDirectory.getName());
		List<IFile> children = pDirectory.getChildren();
		for (IFile file : children )
		{
			for (int i = 0; i < file.getLevel(); i++)
			{
				System.out.print("  ");
			}
			System.out.println(file.getName());
		}
	}

	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		for (int i = 0; i < pSymLink.getLevel(); i++)
		{
			System.out.print("  ");
		}
		System.out.println(pSymLink.getName());
	}
}