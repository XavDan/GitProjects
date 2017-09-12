import java.util.Scanner;
import java.util.Arrays;
public class APJeffrey 
{
/* Xavi
 * 9/1/2017
 * Startin up java again bois
 */
	public static void main(String[] args) 
	{
		//declares a scanner and array for names
		Scanner userInput = new Scanner(System.in);
		String[] names = new String[3];
		//Collects 3 names
		for(int counter = 0; counter < names.length; counter ++)
		{
			System.out.println("Lemme get uhhhhh name");
			names[counter] = userInput.nextLine();
		}
		//Sorts the names alphabetically
		Arrays.sort(names);
		//Prints the names alphabetically
		for(int counter = 0; counter < names.length; counter ++)
		{
			System.out.println(names[counter]);
		}
		

	}	

}
