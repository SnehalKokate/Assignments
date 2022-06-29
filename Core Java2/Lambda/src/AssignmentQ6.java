import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AssignmentQ6 {
	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("snehal");
        list.add("utkarsh");
        list.add("pratap");
        list.add("radha");

        list.replaceAll(new Name());
        list.stream().collect(Collectors.toList()).forEach(System.out::println);

    }
}
class Name implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}