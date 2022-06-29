

import java.util.ArrayList;
import java.util.List;

public class Assignment5 {
	 public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder();
	        List<String> list = new ArrayList<>();

	        list.add("sneha");
	        list.add("neha");
	        list.add("utkarsh");
	        list.add("rutuja");
	       
	        list.forEach(t -> sb.append(t.charAt(0)));
	        System.out.println("The resultant string using string builder");
	        System.out.println(sb);

}
}
