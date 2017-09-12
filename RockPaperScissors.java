import java.util.Scanner;
/* Xavier Danilchenko
 * 9/6/2017
 * Rock Paper Scissors
 * ez
 * hodor
 * finna work somehow bouis
 */
public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		//declares everything we're gonna need
		Scanner userInput = new Scanner(System.in);
		int userWeapon, botWeapon, belethor, scoreHuman =0, scoreBot =0;
		String[] tools= {"filler","Rock","Paper","Scissors"};
		//loops the game
		while(1>0)
		{
			System.out.print("Choose your weapon. 1-Rock 2-Paper 3-Scissors");
			userWeapon = userInput.nextInt();
			botWeapon =(int)(Math.random() * 3 + 1);
			System.out.println(tools[userWeapon] + "\tVS\t" +tools[botWeapon]);
			//Checks who wins and adds to each score
			if(tools[userWeapon] == tools[botWeapon])
			{
				System.out.println("IT'S A TIE!");
			}
			else if(tools[userWeapon].equals("Paper")&& tools[botWeapon].equals("Rock") || tools[userWeapon].equals("Rock") && tools[botWeapon].equals("Scissors") || tools[userWeapon].equals("Scissors") && tools[botWeapon].equals("Paper"))
			{
				System.out.println("YOU WIN!");
				scoreHuman ++;
			}
			else if(tools[userWeapon].equals("Rock")&& tools[botWeapon].equals("Paper") || tools[userWeapon].equals("Scissors") && tools[botWeapon].equals("Rock") || tools[userWeapon].equals("Paper") && tools[botWeapon].equals("Scissors"))
			{
				System.out.println("Get rekt normie");
				scoreBot ++;
			}
			//Prints score before looping
			System.out.println("Score:\tYou: " + scoreHuman + "\tBot: "+ scoreBot);

					
			
		
			
		}

	}

}
