package ca.mcgill.cs.swdesign.m8;

/**
 * Visitor interface.
 * @author Halil Murat
 *
 */
public interface FileSystemVisitor
{
	/**
	 * @param pFile	file to visit
	 */
	void visitFile(File pFile);
	
	/**
	 * @param pDirectory	directory to visit
	 */
	void visitDirectory(Directory pDirectory);
	
	/**
	 * @param pSymLink	symlink to visit
	 */
	void visitSymLink(SymLink pSymLink);
}
