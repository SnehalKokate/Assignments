import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

public class Assignmentq4 {

	public static void main(String[] args) throws IOException {
			 var paths="C:\\Users\\HP\\Desktop\\Assignments\\StudentList.txt";
	        System.out.println("All the Students in the list are: ");
	        Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).forEach(System.out::println);    
	        
	        int x = (int)Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).count();
	        System.out.println("The numbers of students in the sheet is: "+x);
	}

}
