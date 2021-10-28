import java.util.Scanner;

public class PlayerBoard{


	public void placeShips(){
	char [][] board = new char[10][10];
	for (int r = 0; r < 10; r++)//rows
	{
		for (int c = 0; c < 10; c++)//columns
		{
		board[r][c] = ' ';

		}
	}

 	Scanner scan = new Scanner(System.in);
 	Scanner scan2 = new Scanner(System.in);
 	

     for (int i = 0; i<12; i++){
 		char ship = 'i';
 		String shipName = "";
 		if(i<3){
 			ship = 'a';
 			shipName = "of length 3";
 		}
 		else if (i<7 && i>=3){
 			ship = 'b';
 			shipName = "of length 4";
 		}
 		else if (i<12 && i>=7){
 			ship = 'c';
 			shipName = "of length 5";
 		}
 		System.out.print("Choose the column number of your ship " + shipName + ":");
 		int colPos = scan.nextInt();
 		System.out.print("Choose the row number of your ship " + shipName + ":");
 		int rowPos = scan2.nextInt();
 		board[colPos][rowPos] = ship;
 		
 		
		System.out.println("YOUR SHIPS");//board for player ships
		System.out.println("  |0|1|2|3|4|5|6|7|8|9| ");
		for (int r = 0; r < 10; r++)//rows
		{
			System.out.print(r + " |");
			for (int c = 0; c < 10; c++)//columns
			{	
			System.out.print( board[r][c]+ "|" );

			}
		
			System.out.println("");
			}
			
		}
		
		
	}
 

 }


