package lastDay;

import java.util.Scanner;

public class jobApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner user = new Scanner (System.in);
	
	String first = "";
	String last = "";
	String email = "";
	String position = "";
	long number = 0;
	
	System.out.println("CVS Job Application");
	
	System.out.println("First name?");
	first = user.next();
	System.out.println("Last name?");
	last = user.next();
	System.out.println("Phone number?");
	number = user.nextLong();
	System.out.println("Hello " + first + " our available");
	System.out.println("jobs are Stocker, Cashier, and Manager.");
	System.out.println("");
	System.out.println("Please select a position.");
	position = user.next();
	
	
	if (position.equalsIgnoreCase("Manager")) {
		
		System.out.println("As a Manager you are reaponsible for");
		System.out.println("stocking merchandise on shelves and");
		System.out.println("in storage. You will also be");
		System.out.println("obligated to guide the customers");
		System.out.println("through the store. Must be able");
		System.out.println("to lift at least 40 pounds and");
		System.out.println("be at least 16 years old.");
		
		}
	
	if (position.equalsIgnoreCase("Stocker")) {
		
		System.out.println("As a stocker you are responsible");
		System.out.println("for stocking mechandise on shelves");
		System.out.println("and in storage. You will also have");
		System.out.println("to help customers who need guidance");
		System.out.println("around the store. Must be able to");
		System.out.println("lift 40 pounds and must be at 16");
		System.out.println("years old.");
		}
	
	
	if (position.equalsIgnoreCase("Cashier")) {
		System.out.println("As a Cashier your job is to ring up");
		System.out.println("items that are being purchased");
		System.out.println("from our store and will sometimes");
		System.out.println("have to help lost customers find");
		System.out.println("their way through our store.");
		
		}
	
	System.out.println("Thank you for applying for our");
	System.out.println(position + " position at CVS we");
	System.out.println("will contact 2 weeks prior to ");
	System.out.println("inform you if you have an");
	System.out.println("interview.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
