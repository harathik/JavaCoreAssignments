import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassUpper {

	public static void main(String[] args) {
		List<String> ls= new 

ArrayList<>(Arrays.asList("Aka","Boomboom","Cutie","Doggy","hello","hai"));
		System.out.println(ls);
		
		List<String> s= new ArrayList<>(); 
		s.add("hai");
		System.out.println(s);
		ls.replaceAll(n -> n.toLowerCase()); //to change to Lower case
		System.out.println(ls);
		
		ls.replaceAll(n -> 

n.toUpperCase()); //to change to Upper case
		System.out.println(ls);
	

	}

}
