package ca.mcgill.cs.swdesign.m8;

/**
 * A mock-up to test the program.
 * @author Halil Murat
 */
public class VisitorTest
{
	/**
	 * @param pArgs	arguments
	 */
	public static void main(String[] pArgs)
	{
		IFile[] homesFiles = {};
		IFile[] rootsFiles = {new File("system.c", 1), 
						 new File("system.out", 1),
						 new Directory("home", 1, homesFiles)};
		
		Directory d = new Directory("root", 0, rootsFiles);
		d.accept(new PrintVisitor());
	}
}
