import java.util.HashSet;
import java.util.LinkedHashSet;
public class LinkedhashsetClass {

	public static void main(String[] args) {
		
		HashSet<String> n=new HashSet<>();
		n.add("pinkbarbie");
		n.add("powerrangers");
		n.add("vickeyandvethal");
		n.add("agdambagadamtigadam");
		
		System.out.println("Unorderd "+n);
		
		LinkedHashSet<String> ln=new LinkedHashSet<String>();
		ln.add("dora");
		ln.add("jerry");
		ln.add("hydi");
		ln.add("shiva");		
		System.out.println("Orderd "+ln);
		
	}

}
