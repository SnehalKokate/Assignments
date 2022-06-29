import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
	List <Fruit> fruitList=new LinkedList<>();
	
	fruitList.add(new Fruit("Apple",80,150,"Red"));
	fruitList.add(new Fruit("Banana",200,50,"Yellow"));
	fruitList.add(new Fruit("Orange",70,200,"Orange"));
    fruitList.add(new Fruit("Mango",100,300,"Yellow"));
	
  //1. Fruits with calories less than 100
    System.out.println("Fruit with calories less than 100: ");
    fruitList.stream().filter(x -> x.getCalories() < 100).map(Fruit::getName).forEach(System.out::println);
  //2. Sorting fruits according to their color
    System.out.println("Sorting fruits according to their color");
    fruitList.stream().sorted(Comparator.comparing(Fruit::getColor)).map(Fruit::getName).forEach(System.out::println);
    //3. Only red color fruits
    System.out.println("Only red color fruits");
    fruitList.stream().filter(x -> x.getColor().contains("red")).forEach(System.out::println);


    List<News> newsList = new LinkedList<>();
    newsList.add(new News(12, "Raj", "Sita", "Very nice budget"));
    newsList.add(new News(12, "Ram", "Gita", "Excellent"));
    newsList.add(new News(12, "Sham", "Sita", "Amazing budget"));
    newsList.add(new News(13, "Ram", "Mona", "not so good"));
    //4. NewsId with maximum comment
    System.out.println("News ID with maximum comment");
    newsList.stream().max(Comparator.comparing(News::getCommentByUser).reversed()).ifPresent(System.out::println);
    //5. Budget Count
    System.out.println("Counting the word budget in comment");
    int count = (int) newsList.stream().filter(x -> x.getComment().contains("budget")).count();
    System.out.println("No. of time word Budget Appeared: " + count);
    //6. User with  Maximum comment
    System.out.println("User with  Maximum comment");

    Optional<String> max = newsList.stream().map(News::getCommentByUser).max((i, j) -> i.compareTo(j));
    System.out.println(max.get());
    //7. print get comment by user
    System.out.println("print get comment by user");
    newsList.stream().max(Comparator.comparing(News::getNewsId).reversed()).map(News::getCommentByUser).ifPresent(System.out::println);


    List<Trader> TraderList = new LinkedList<>();
    TraderList.add(new Trader("Raj", "pune"));
    TraderList.add(new Trader("Ram", "Mumbai"));
    TraderList.add(new Trader("Sham", "Indore"));
    TraderList.add(new Trader("Aditya", "pune"));
   
    //9. Unique cities where trader work from
    System.out.println("Unique cities where trader work from");
    TraderList.stream().map(Trader::getCity).distinct().forEach(System.out::println);
    //10. Trader who are in pune
    System.out.println("Trader in pune");
    TraderList.stream().filter(x -> x.getCity().contains("pune")).forEach(System.out::println);
    //11. Trader name sorted alphabetical
    System.out.println("Trader name sorted alphabetical");
    TraderList.stream().sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
    //12. Are any traders based in indore
    boolean checkindore = TraderList.stream().anyMatch(x -> x.getCity().contains("Indore"));
    System.out.println("Are there any trader based in indore: " + checkindore);

    List<Transaction> transList = Arrays.asList(
            new Transaction(new Trader("Rutuja", "Delhi"), 2012, 4500),
            new Transaction(new Trader("Sneha", "Delhi"), 2011, 4800),
            new Transaction(new Trader("Neha", "Indore"), 2011, 4400));
    //8. Transaction of a particular year
    System.out.println("Transaction of year 2011");
    transList.stream().filter(x -> x.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

    //13. Transaction from traders living in delhi
    System.out.println("Transaction from traders living in delhi");
    transList.stream().filter(x -> x.getTrader().getCity().contains("Delhi")).map(Transaction::getValue).forEach(System.out::println);

    //14. Highest transaction value
    System.out.println("Highest Transaction value");
    transList.stream().sorted(Comparator.comparing(Transaction::getValue).reversed()).limit(1).forEach(System.out::println);
    //15. Transaction with smallest value
    System.out.println("Transaction with smallest value");
    transList.stream().sorted(Comparator.comparing(Transaction::getValue)).limit(1).forEach(System.out::println);
}
	

}
