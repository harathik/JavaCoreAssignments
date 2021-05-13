package comharathi;


import java.util.ArrayList;
import java.util.ListIterator;

public class SortArray {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
			al.add("hara");
			al.add("capg");
			al.add("myman"); 
			al.add("sister");
			al.add("covid");
			
			ListIterator<String> list1=al.listIterator(al.size());  
			 while(list1.hasPrevious())  
	         {  
	             String str=list1.previous();  
	             System.out.println(str);  
	         }  
			
}
}
