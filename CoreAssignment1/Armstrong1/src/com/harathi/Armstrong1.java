package com.harathi;
public class Armstrong1 {

	public static void main(String[] args) {
		int i,a,n,rem=0;
		System.out.println("Armstrong number :");
		for(i=100;i<=1000;i++)
		{
		n=i;
		rem=0;
		while(n>0)
		{
			a=n%10;
			rem=rem+(a*a*a);
			n=n/10;
		}
		if(rem==i)
			System.out.println(i);
		}

	}

}
