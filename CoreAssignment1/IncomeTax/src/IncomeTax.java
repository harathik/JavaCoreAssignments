

import java.util.Scanner;

class IncomeTax
{
	public static void main(String args[])
	{
	double tax=0,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	i=sc.nextDouble();
	if(i<=200000)
		tax=0;
	else if(i<=300000)
		tax=0.1*(i-200000);
	else if(i<=500000)
		tax=(0.2*(i-300000))+(0.1*100000);
	else if(i<=1000000)
		tax=(0.3*(i-500000))+(0.2*200000)+(0.1*100000);
	else
		tax=(0.4*(i-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
	System.out.println("Income tax amount is "+tax);
	}
}