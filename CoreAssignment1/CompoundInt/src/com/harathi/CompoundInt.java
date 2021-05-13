package com.harathi;

import java.util.Scanner;

public class CompoundInt {

	public static void main(String[] args) {
		double a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  principle");
		int prin = sc.nextInt();
		System.out.println("Enter  rate");
		double rate = sc.nextDouble();
		System.out.println("Enter  day");
		int n = sc.nextInt();
		
		for(int n2=1;n2<=10;n2++) {
		a=prin*Math.pow(1+rate, n);
		System.out.println("The amount is" +" "+ n);
		}
		
	}
}

