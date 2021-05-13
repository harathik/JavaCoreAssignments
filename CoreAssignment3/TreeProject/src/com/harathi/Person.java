package com.harathi;



public class Person implements Comparable<Person>{
	
	String name;
	Integer wei;
	Integer hei;
	
	
	 public Person(Integer hei,Integer wei, String name)
	{
		super();
		this.hei=hei;
		this.wei= wei;
		this.name = name;
	}
	
	public Integer getHeight() {
		return hei;
	}
	public Integer getWeight() {
		return wei;
	}
    public String getName() {
    	return name;
    }
    public String toString()
    {
    	return"Person [name is "+name+", Height is "+hei+", Weight is "+wei+"]";
    }
    
    public int compareTo(Person o) {
    	if(this.getWeight()==o.getWeight())
    		return this.getHeight().compareTo(o.getHeight());
    	else
    		return this.getWeight().compareTo(o.getWeight());
    }
}
