package ca.mcgill.cs.swdesign.m8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Halil Murat
 */
public class Directory extends AbstractFile
{
	private List<IFile> aIFiles;
	
	/**
	 * @param pName		name of the directory
	 * @param pLevel	level of the directory
	 * @param pFiles	child nodes of directory
	 */
	protected Directory(String pName, int pLevel, IFile...pFiles)
	{
		super(pName, pLevel);
		aIFiles = new ArrayList<IFile>(pFiles.length);
		aIFiles.addAll(Arrays.asList(pFiles));
	}

	@Override
	public void accept(FileSystemVisitor pVisitor)
	{
		pVisitor.visitDirectory(this);
	}

	/**
	 * @return	the list of files and sub-directories in this directory
	 */
	public List<IFile> getChildren()
	{
		return aIFiles;
	}
}
