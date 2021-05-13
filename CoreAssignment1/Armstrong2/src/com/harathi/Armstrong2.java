package com.harathi;
import java.util.Scanner;


public class Armstrong2 {
	
	public static void main(String[] args) {
		int c=0,a,temp;
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("It's armstrong");
		else
			System.out.println("It's not  Armstrong");
	}
	

}
