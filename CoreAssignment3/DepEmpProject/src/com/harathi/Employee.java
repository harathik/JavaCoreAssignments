package com.harathi;


public class Employee {
	private Integer Eid;
	private String Ename;
	private Integer sal;
	private String email;
	
	public Employee(Integer Eid,String Ename, Integer sal,String email)
	{
		super();
		this.Eid = Eid;
		this.Ename = Ename;
		this.sal = sal;
		this.email = email;
	}
	public Integer getEid(){
		return Eid;
	}
	public String getEname(){
		return Ename;
	}
	public Integer getsal(){
		return sal;
	}
	public String getemail(){
		return email;
	}

	public String toString()
    {
    	return "Employee [Eid=" + Eid + ", Ename="+Ename+", Salary"+sal+"]";
    }
	
	public int hashCode() {
		return 15;
	}
	public boolean equals (Object obj) {
		return true;
	}

}
