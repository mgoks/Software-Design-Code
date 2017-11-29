package ca.mcgill.cs.swdesign.m8;

/**
 * An interface for all nodes in the file system.
 * @author Halil Murat
 *
 */
public interface IFile
{
	/**
	 * Calls visitFile().
	 * @param pVisitor	visitor to accept
	 */
	void accept(FileSystemVisitor pVisitor);
	
	/**
	 * Getter.
	 * @return	the name of IFile
	 */
	String getName();
	
	/**
	 * @return	level of IFile
	 */
	int getLevel();
}
