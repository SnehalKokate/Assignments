import java.util.ArrayList;

public class AssignmentQ4 {
	public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Java");
        list.add("SQL");
        list.add("Spring");
        list.add("Angular");
        list.add("React");
        

        System.out.println(list);
        System.out.println("For even values length");
        list.removeIf(x->(((String) x).length()%2)!=0);
        System.out.println(list);
}
}
