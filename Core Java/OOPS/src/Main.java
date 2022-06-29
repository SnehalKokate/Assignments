
//1. static object in the class to be made singleton
//2. A private constructor inside the class.
//3. A public static method that returns the static object created in the first step.
public class Main {
	 public static void main(String[] args) {
		 Singleton object=Singleton.display();
	    }
}

class Singleton{
    static Singleton obj= new Singleton();
    private Singleton(){

    }
    public static Singleton display(){
        return obj;
    }
}


//class Example extends Singleton{
//	
//}