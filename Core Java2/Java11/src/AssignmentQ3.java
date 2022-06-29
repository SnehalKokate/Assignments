import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentQ3 {
	public static void main(String[] args) {
		String str="A quick brown fox jumps over lazy dog";
	        ArrayList<String> list=new ArrayList<>();
	       
	        list.addAll(Arrays.asList(str.split(" ")));
	        System.out.println(list);
	        String[] array= list.toArray(new String[0]);
	        Arrays.stream(array).forEach(t-> System.out.println(t));
	        
	    }
}
