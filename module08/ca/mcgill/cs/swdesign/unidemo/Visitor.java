package ca.mcgill.cs.swdesign.unidemo;

public interface Visitor
{
	void visitUniversity(University pUniversity);
	void visitFaculty(Faculty pFaculty);
	void visitDepartment(Department pDepartment);
	
	/**
	 * Visits all sub-committees of pCommittee.
	 * @param pCommittee
	 */
	void visitCommittee(Committee pCommittee);
}
