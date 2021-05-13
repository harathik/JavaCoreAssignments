import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Cons {

	public static void main(String[] args) {
		
		 Consumer<String> O1 = x -> System.out.println(x.toLowerCase());
	     Consumer<String> O2 = y -> System.out.println(y.toUpperCase());
	 
	     Consumer<String> result = O1.andThen(O2);
	 
	    result.accept("pokemon");
	 }
	
	}
class JavaPrediction {  
    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 18); 
        System.out.println(pr.test(18));      
    }  
}


class JavaSupplier {

	 
	 public static void main(String[] args) {
	 
	  Supplier<String> supplier= ()-> "pokemon";
	  System.out.println(supplier.get());
	 }
	}

