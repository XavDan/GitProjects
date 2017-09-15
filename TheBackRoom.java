import java.util.Hashtable;
import java.util.Set;
public class TheBackRoom
{
	private static Hashtable<String, Double> menu = new Hashtable<String, Double>();
	private static Set<String> keys = menu.keySet();
	//private String[] order = new String[50];
	private String[] order;
	
	
	public TheBackRoom (String[] customer)
	{
		order = customer;
	}
		
	
	public void total(double order[])
	{
		double total = 0;
		for(int counter = 0; counter < order.length; counter ++)
		{
			total += order[counter];
		}
	}
	
	public static void initiate()
	{
		menu.put("Big Mac", (3.99));
		menu.put("Jeffethor", (3.99));
		menu.put("Filler", (10.99));
		menu.put("Hodor", (1000.99));
	}
	public static void getMenu()
	{
		for(String key: keys)
		{
			System.out.println(key+"...\t\t"+menu.get(key));
		}
	}
	
	
}
