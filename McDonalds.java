import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
public class McDonalds 
{
	public static Hashtable<String, Double> menu = new Hashtable<String, Double>();
	public static Set<String> keys = menu.keySet();
	public static String[] order = new String[50];
	public static Scanner userInput = new Scanner(System.in);
	public static int counter;
	public static double total;
	public static void main(String[] args) 
	{
		//KEYS AND PRICES FOR ORDER
		menu.put("Big Mac", (3.99));
		menu.put("Jeffethor", (3.99));
		menu.put("Filler", (10.99));
		menu.put("Hodor", (1000.99));

		System.out.println("Hello, welcome to McDonalds! Our automated service "
				+ "system will now take your order.");
		System.out.println("\t     MENU");
		getMenu();
		System.out.println("Please enter your order now.");
		//addOrder();
		startOrder();
		System.out.println("Thank you for coming to McDonald's. Have a nice day!");
		System.exit(0);


	}
	public static void startOrder()
	{
		String hodor; 
		while(true)
		{
			hodor = userInput.next();
			order[counter] = hodor;
			counter ++;

			System.out.println("Will that be all? Type 'yes' to proceed to checkout,"
					+ " or continue typing food to add to your order.");
			hodor = userInput.next();
			if(hodor.equals("yes"))
			{
				return;
			}

		}


	}
	public static void getMenu()
	{
		for(String key: keys)
		{
			System.out.println(key+"...\t\t"+menu.get(key));
		}
	}
	public static void addOrder()
	{
		for(String keebler : order)
		{
			
		}
	}

}
