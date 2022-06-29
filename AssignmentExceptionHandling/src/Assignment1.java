import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        try{
	            System.out.printf("Enter the first number and second number: ");
	            int numerator=sc.nextInt();
	            int denominator=sc.nextInt();
	            double quotient=numerator/denominator;
	            System.out.println("The quotient is "+quotient);

	        }
	        catch (ArithmeticException e){
	            System.out.printf("Cannot divide by zero");
	        }

	}

}
