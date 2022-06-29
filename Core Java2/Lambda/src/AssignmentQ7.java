

import java.util.HashMap;

public class AssignmentQ7 {

	public static void main(String[] args) {
		 StringBuilder s=new StringBuilder();
	        HashMap<Integer,String> map=new HashMap<>();
	        map.put(1,"Java");
	        map.put(2,"SQL");
	        map.put(3,"Spring");
	        map.put(4,"Angular");


	        map.entrySet().forEach(t-> s.append(t));
	        System.out.println(s);
	}

}
