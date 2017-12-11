package ca.mcgill.cs.swdesign.m8;

/**
 * Top of this type hierarchy.
 * @author Halil Murat
 */
public interface Visitable
{
	void accept(Visitor pVisitor);
}
