package com.harathi;

import java.util.Scanner;

public class Res {
	int s1,s2,s3;
	private void Subject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1:");
		int s1 = sc.nextInt();
		System.out.println("Enter  s2:");
		int s2 = sc.nextInt();
		System.out.println("Enter s3:");
		int s3 = sc.nextInt();
		
		System.out.println("The marks of a:"+s1);
		System.out.println("The marks of b:"+s2);
		System.out.println("The marks of c:"+s3);
		
		if(s1>=60 && s2>=60 && s3>=60) {
			System.out.println("PASSED");
}
		else if(s1>=60 && s2>=60 || s1>=60 && s3>=60 || s2>=60 && s3>=60) {
			System.out.println("PROMOTED");}

		else {
			System.out.println("FAILED");
		}
		
		}

	}


