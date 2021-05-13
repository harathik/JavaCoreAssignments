
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
public class CLassThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> T1= new ArrayList<Integer>();
	        T1.add(41);
	        T1.add(23);
	        T1.add(36);
	        
	        Thread n = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                
	                T1.stream().forEach(t -> System.out.println(t));
	            }
	        });
	        n.run();
	    }
	}
