import java.util.*;


/*******************************
 * Name: Your name Class: ICS3U Date: Friday Sept. 25 Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the
 * following criteria: Create a restaurant of your choosing Print menu items one
 * at a time, including the price. Ask how many of each item they would like to
 * purchase Must have at least 5 different menu items Calculate the total price
 * If the total is more than $30, take off 10%. If the total is more than $50,
 * take off 20%. Add 13% HST to the total Print out the initial price, any
 * discounts, taxes, and the grand total. Read in a payment amount from the user
 * Calculate the change If the change is negative, state that they still owe you
 * money. This is to be done individually. DO NOT use AI! Feel free to use
 * previous notes, videos, and online resources like w3schools.com Fork the
 * repository, add me (MrZebarth) as a collaborator, clone the repository to
 * your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Hey, welcome to Dom's Dumplings!");
		System.out.println(" ");
		System.out.println("Could I get you started with a drink?");
		System.out.println(" ");
		System.out.println("- Coke            $1.50");
		System.out.println("- Pepsi           $1.50");
		System.out.println("- Fanta           $1.50");
		System.out.println("- Mountain Dew    $1.50");
		System.out.println("- Fuze Tea        $1.50");
		System.out.println("  ");
		int coke = in.nextInt();
		System.out.println(" ");
		System.out.println("You want " + coke + " which costs " + coke * 1.50);
		String ya = in.nextLine();
		System.out.println(" ");
		System.out.println("Wow," + ya + ". Great choice.");
		System.out.println(" ");
		System.out.println("Could I interest you in some tea?");
		System.out.println(" ");
		System.out.println("- Green Tea        $2.50");
		System.out.println("- Ulong Tea        $2.50");
		System.out.println("- Brown rice Tea   $2.50");
		System.out.println("  ");
		int tea = in.nextInt();
		System.out.println(" ");
		System.out.println("You want " + tea + " which costs " + tea * 2.50);
		String ok = in.nextLine();
		System.out.println(" ");
		System.out.println("Wow," + ok + ". Great choice.");
		System.out.println(" ");
		System.out.println("Let me know when you are ready to see the menu.");
		System.out.println(" ");
		System.out.println("(type \"ready\" when ready)");
		System.out.println(" ");
		String ready = in.nextLine();
		System.out.println(" ");
		System.out.println("Prefect, now that you are " + ready + " here is the menu.");
		System.out.println(" ");
		System.out.println("Soup Dumgpling Menu:");
		System.out.println(" ");
		System.out.println("- Classic pork         $15.99");
		System.out.println("- Spicy pork           $15.99");
		System.out.println("- Sweet & spicy pork   $15.99");
		System.out.println("- Classic shrimp       $15.99");
		System.out.println("- Spicy shrimp         $15.99");
		System.out.println("- Shrimp and pork      $15.99");
		System.out.println("- Veggie               $15.99");
		System.out.println("- Spicy veggie         $15.99");
		System.out.println(" ");
		System.out.println("(Type \"Hey\" to call waitier)");
		System.out.println(" ");
		String Hey = in.nextLine();
		System.out.println(" ");
		System.out.println(Hey + ", looks like you've made up your mind, what can I get for you? ");
		System.out.println(" ");
		int dump = in.nextInt();
		System.out.println(" ");
		System.out.println("You want " + dump + " which costs " + dump * 15.99);
		String order = in.nextLine();
		System.out.println(" ");
		System.out.println("Hmmmm, " + order + ". Good choice!");
		System.out.println(" ");
		System.out.println("Is it your birthday?");
		System.out.println(" ");
		 String answer = in.nextLine();
		  
		   if (answer.equals("yes"))  {
	        System.out.println("Amazing, we will bring out a peice of our signiture strawberry short cake!");
	        } else if (answer.equals("no"))	{
	           String string2 = "alright.";
	        }
		double total;
		total =  (dump * 15.99 + coke * 1.50 + tea * 2.50);
		if (total > 50) {
			total = (total * 0.8);
		} else 	if (total > 30) {
			total =  (total * 0.9);
		}
		System.out.println("Would you like to donate 1 dollar to charity?");
		
		   String answer1 = in.nextLine();
		  
		   if (answer1.equals("yes"))  {
	        total = total + 1;
	        } else if (answer1.equals("no"))	{
	           total = total + 0;
	        }
		System.out.printf("Your total will come out to: " + total* 1.13 + " , enjoy your meal!");{
			
		}}}
		
		
	        


