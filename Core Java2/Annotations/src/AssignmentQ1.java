import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface test{
  int testCaseNo();
}
public class AssignmentQ1 {
	 @Test(testCaseNo=1)
	
	  public static void main(String[] args) {

	  }
		

	

}


