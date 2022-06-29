import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AssignmentQ5 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
	        var pathts ="C:\\Users\\HP\\Desktop\\Assignments\\record.txt";
	        System.out.println("Select Your choice");
	        System.out.println("1}Insert New Price 2}View Total Price 3}Exit");
	        int itemNumber =1;
	        int choice= s.nextInt();
	        boolean b = true;
	        switch (choice){
	            case 1: {
	                System.out.println("Enter the Price of item " + itemNumber + ": ");
	                String price = s.next();
	                Files.writeString(Path.of(pathts), price+"\n", StandardOpenOption.APPEND);
	                System.out.println("Price has been saved in file");
	                break;
	            }
	            case 2:{
	                Scanner read=new Scanner(Files.readString(Path.of(pathts)));
	                int total=0;
	                while (read.hasNext()){
	                    total = total+read.nextInt();
	                }
	                System.out.println("Your total is: "+total);
	                break;
	            }
	            case 3:{
	                System.out.println("exit program....");
	                break;
	            }
	        }
	}

}
