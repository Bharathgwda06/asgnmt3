package today;
import prb2.*;

public class MainApp {

	public static void main(String[] args) {
		Author ar = new Author("divya" , "divya@gmail.com" , 'f');
		Book bru = new Book("bharath" ,ar, 1300.50 , 2);
		bru.setPrice(1200);
		bru.setqty(4);
		System.out.println(bru.toString());
		
		
		Employee hru = new Employee(1234 , "Bharath" , "Gowda" , 50000);
		hru.raiseSalary(10);
		System.out.print(hru);
	}

}
