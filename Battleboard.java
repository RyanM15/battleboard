
	public class Battleboard{
	
	
	
	public static void main (String[] args) {
	
	char [][] board = new char[10][10];//creates a ten by ten array
	
	
	System.out.println("YOUR SHIPS");//board for player ships
	System.out.println("  |0|1|2|3|4|5|6|7|8|9| ");
	for (int r = 0; r < 10; r++)//rows
	{
		System.out.print(r + " |");
		for (int c = 0; c < 10; c++)//columns
		{
		System.out.print( " |" );

		}
		
		System.out.println("");
	}
	
	
	
	
}
	
}
	
	
