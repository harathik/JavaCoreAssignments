import java.util.Arrays;

public class classlett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb=new StringBuilder();
		
		Arrays.asList("papad","kfcburger","dominozpizza","gismatmandi")
		.forEach(n->sb.append(n.charAt(0)));
		
		System.out.println(sb);
	}

}
