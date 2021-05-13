
import java.util.ArrayList;

public class ClassOdd {

	public static void main(String[] args) {
		
		ArrayList<String>n=new ArrayList<String>();
		
		n.add("dora");
		n.add("stewwartlittle");
		n.add("richie_ric");
		n.add("doremon");
		n.add("nobitha");
		
		
		System.out.println(n);
		
		n.removeIf(t->(t.length()%2==1));
		System.out.println(n);
	
		
		}
		
	}