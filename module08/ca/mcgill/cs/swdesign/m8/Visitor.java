package ca.mcgill.cs.swdesign.m8;

public interface Visitor
{
	void visitFile(File pFile);
	
	void visitSymLink(SymLink pSymLink);
	
	void visitDirectory(Directory pDirectory);
	
//	void visitHidden(HiddenDirectory pHidden);
}
