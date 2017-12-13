package ca.mcgill.cs.swdesign.unidemo;

import java.util.Iterator;

/**
 * Discovers the sub-committee depth of a committee that matches an input query. 
 * For example, a root committee would have value 0, a sub-committee, 1, and a sub-sub-committee 3.
 * 
 * @author Halil Murat
 */
public class CommitteeDepthVisitor extends DefaultVisitor
{
	private final String aQuery;
	private int aDepth;
	
	public CommitteeDepthVisitor(String pQuery)
	{
		aQuery = pQuery;
		aDepth = 0;
	}
	
//	@Override
//	public void visitUniversity(University pUniversity)
//	{
//	}
//
//	@Override
//	public void visitFaculty(Faculty pFaculty)
//	{
//	}
//
//	@Override
//	public void visitDepartment(Department pDepartment)
//	{
//	}
	
	int getDepth()
	{
		return aDepth;
	}

	@Override
	public void visitCommittee(Committee pCommittee)
	{
		if (pCommittee.getName().equals(aQuery))
		{
			return;
		}
		aDepth++;
		super.visitCommittee(pCommittee);
//		aDepth--;
		return;
	}
}