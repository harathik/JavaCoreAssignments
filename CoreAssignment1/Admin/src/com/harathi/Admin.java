package com.harathi;

import java.util.Scanner;

public class Admin{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0;
		String n="harathi";
		String p="hayathi";
		
		for(int i=0;i<=2;i++) {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("enter password");
			String password = sc.next();
			if(n.equals(name) && p.equals(password)) {
				System.out.println("Welcome:)"+" " +name);
				break;
				
			}
			c++;
		}
		if(c>=3) {
			System.out.println(" Admin");
		}
	}

}
