import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.printf("Enter the first number and second number: ");
            int numerator=sc.nextInt();
            int denominator=sc.nextInt();
            double quotient=divideOperation(numerator,denominator);
            System.out.println("The quotient is "+quotient);

        }
        catch (UnsupportedOperationException e){
            System.out.printf("Cannot divide by zero");
        }
    }
    public static int divideOperation(int num,int den) throws UnsupportedOperationException{
        if(den==0){
            throw new UnsupportedOperationException("Cannot divide by 0");
        }
        return num/den;
    }
}

class UnsupportedOperationException extends Exception{
    UnsupportedOperationException(String message){
        super(message);
    }
}