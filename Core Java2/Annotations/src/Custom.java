import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@interface details{
    int authorID();
    String author() default "Null";
    String supervisor() default "Null";
    String date();
    String time();
    int version();
    String description() default "General class";
}


@details(authorID = 1, date = "28-06-2022", time = "1pm", version = 2)
public class Custom {

}
