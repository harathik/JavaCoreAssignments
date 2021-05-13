import java.util.Scanner;
import java.util.function.Consumer;

public class CLassOrd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order value :");
		Integer a= sc.nextInt();
		//int a = 1000;
		
		Consumer<Integer> action = b-> {
			if (a>1000) {
				System.out.println("ACCEPTED");}
			else
				{System.out.println("REJECTED");}
				
		};
	action.accept(a);
	}
}