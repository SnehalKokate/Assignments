import java.util.Scanner;

public class AssignmentQ1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
       System.out.println("Enter your Principle, rate and time: ");
       int principle=s.nextInt();
       int rate=s.nextInt();
       int time= s.nextInt();
       Interest simpleInterest = (p,r,t) -> System.out.println("The simple Interest: "+ (p*r*t)*0.01);
       simpleInterest.give(principle,rate,time);
 }
}

@FunctionalInterface
interface Interest{
	public void give(int p,int r,int t);
	}
