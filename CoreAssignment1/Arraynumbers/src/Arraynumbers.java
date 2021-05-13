
import java.util.Scanner;

public class Arraynumbers {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  value");
		int value = sc.nextInt();
		int flag=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==value) {
				System.out.println(value+ "is found");
				flag=1;
				break;
			}
		}if(flag==0)
		{
			System.out.println(value+ "is not found");
		}

	}

}

