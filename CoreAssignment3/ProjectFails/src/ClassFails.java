
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClassFails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<Object> n=new HashSet();
		
		n.add("dora");
		n.add("doreamon");
		n.add(25);
		n.add(55);

		Iterator i=n.iterator();
		 while(i.hasNext())
		   {
			   
			   Object a=i.next();
			   n.add("chota bheem");
			   System.out.println(a); 
		   }
	}
}
