public class matrix 
{

	public static void main(String[] args) 
	{
		int[] matrix = new int[3];
		matrix[0] = 0;
		matrix[1] = 0;
		matrix[2] = 1;
		int counter = 0;
		int jeff = (int)(Math.random() * 2 + 1);
		
		while(true)
		{
			System.out.print(matrix[jeff]);
			counter ++;
			if(counter == 200)
			{
				System.out.println();
				counter = 0;
			}
			jeff = (int)(Math.random() * 2 + 1);
		}

	}

}
