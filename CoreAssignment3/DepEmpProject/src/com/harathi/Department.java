package com.harathi;


public class Department {
	private Integer Did;
	private String Dname;
	private String DLoc;

	public Department(Integer Did,String Dname,String DLoc)
	{
		super();
		this.Did = Did;
		this.Dname = Dname;
		this.DLoc = DLoc;
	}
	
	public String toString()
    {
    	return "Department [Did=" + Did + ", Dname="+Dname+ "]";
    }
}
