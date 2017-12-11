package ca.mcgill.cs.swdesign.m8;

import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractFile
{
	private List<IFile> aChildren;
	
	public Directory(String pName)
	{
		super(pName);
		aChildren = new ArrayList<IFile>();
	}

	@Override
	public void accept(Visitor pVisitor)
	{
		pVisitor.visitDirectory(this);
	}
	
	public void addChild(IFile pChild)
	{
		aChildren.add(pChild);
	}
	
	public List<IFile> getChildren()
	{
		return aChildren;
	}
	
	public List<Directory> getSubDirs()
	{
		List<Directory> subDirs = new ArrayList<Directory>();
		for (IFile iFile : aChildren)
		{
			if (iFile instanceof Directory)
			{
				subDirs.add((Directory) iFile);
			}
		}
		return subDirs;
	}
}
