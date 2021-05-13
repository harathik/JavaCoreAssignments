package com.harathi;


import java.util.Map.Entry;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Employee e1=new Employee(1009,"harathi",30000,"hara@ok.com");
		Employee e2=new Employee(1020,"harika",50000,"harika@ok.com");
		Employee e3=new Employee(1005,"ramya",20000,"ram@ok.com");
		Employee e4=new Employee(1010,"dinesh",80000,"din@ok.com");
		
		Department d1 = new Department(10001,"IT","Boston");
		Department d2 = new Department(10003,"ECE","Haldwani"); 
		
		Map<Employee,Department> empDeptMap = new HashMap<>();
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d2);
		empDeptMap.put(e3, d1);
		empDeptMap.put(e4, d2);
		
		Set<Entry<Employee,Department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<Employee,Department>>iterator= entrySet.iterator();
		
		for(Entry<Employee,Department> entry:entrySet) {
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			
			System.out.println(employee);
			System.out.println(department);
			
		}
		
		
		
	}

}
