import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    int sequence() default 0;
}

public class AssignmentQ3 {
	public static void main(String[] args) {
        Testing testing= new Testing(56);
        Class t=testing.getClass();
        Annotation a=t.getAnnotation(Execute.class);
        Execute x=(Execute)a;
        System.out.println(x.sequence());
    }

}

class Testing{
    private int pin;
    public Testing(int pin){
        this.pin=pin;
    }
    @Execute(sequence=1)
    public static void run(){
    }
    @Execute(sequence=2)
    public static void run2(){
    }
}