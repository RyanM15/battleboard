
	import java.util.Scanner;
	public class Battleboard{
	
	
	
	public static void main (String[] args) {

  
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	char [][] board = new char[10][10];//creates a ten by ten array
System.out.println("   |1|2|3|4|5|6|7|8|9|10| "); //added numbers and letters to be more precise with the grid and more true to the original game
	System.out.println("1  |" + board [0][0] +  "|" + board [0][1] + "|" + board [0][2] + "|" + board [0][3] + "|" + board [0][4] + "|" + board [0][5] + "|" + board [0][6] + "|" + board [0][7] + "|" + board [0][8] + "|" + board [0][9] + "| ");
	
	System.out.println("2  |" + board [1][0] +  "|" + board [1][1] + "|" + board [1][2] + "|" + board [1][3] + "|" + board [1][4] + "|" + board [1][5] + "|" + board [1][6] + "|" + board [1][7] + "|" + board [1][8] + "|" + board [1][9] + "| ");
	
	System.out.println("3  |" + board [2][0] +  "|" + board [2][1] + "|" + board [2][2] + "|" + board [2][3] + "|" + board [2][4] + "|" + board [2][5] + "|" + board [2][6] + "|" + board [2][7] + "|" + board [2][8] + "|" + board [2][9] + "| ");
	
	System.out.println("4  |" + board [3][0] +  "|" + board [3][1] + "|" + board [3][2] + "|" + board [3][3] + "|" + board [3][4] + "|" + board [3][5] + "|" + board [3][6] + "|" + board [3][7] + "|" + board [3][8] + "|" + board [3][9] + "| ");
	
	System.out.println("5  |" + board [4][0] +  "|" + board [4][1] + "|" + board [4][2] + "|" + board [4][3] + "|" + board [4][4] + "|" + board [4][5] + "|" + board [4][6] + "|" + board [4][7] + "|" + board [4][8] + "|" + board [4][9] + "| ");
	
	System.out.println("6  |" + board [5][0] +  "|" + board [5][1] + "|" + board [5][2] + "|" + board [5][3] + "|" + board [5][4] + "|" + board [5][5] + "|" + board [5][6] + "|" + board [5][7] + "|" + board [5][8] + "|" + board [5][9] + "| ");
	
	System.out.println("7  |" + board [6][0] +  "|" + board [6][1] + "|" + board [6][2] + "|" + board [6][3] + "|" + board [6][4] + "|" + board [6][5] + "|" + board [6][6] + "|" + board [6][7] + "|" + board [6][8] + "|" + board [6][9] + "| ");
	
	System.out.println("8  |" + board [7][0] +  "|" + board [7][1] + "|" + board [7][2] + "|" + board [7][3] + "|" + board [7][4] + "|" + board [7][5] + "|" + board [7][6] + "|" + board [7][7] + "|" + board [7][8] + "|" + board [7][9] + "| ");
	
	System.out.println("9  |" + board [8][0] +  "|" + board [8][1] + "|" + board [8][2] + "|" + board [8][3] + "|" + board [8][4] + "|" + board [8][5] + "|" + board [8][6] + "|" + board [8][7] + "|" + board [8][8] + "|" + board [8][9] + "| ");
	
	System.out.println("10 |" + board [9][0] +  "|" + board [9][1] + "|" + board [9][2] + "|" + board [9][3] + "|" + board [9][4] + "|" + board [9][5] + "|" + board [9][6] + "|" + board [9][7] + "|" + board [9][8] + "|" + board [9][9] + "| ");
	
	
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
		board[colPos-1][rowPos-1] = ship;
		
		System.out.println("   |1|2|3|4|5|6|7|8|9|10| "); //added numbers and letters to be more precise with the grid and more true to the original game
	System.out.println("1  |" + board [0][0] +  "|" + board [0][1] + "|" + board [0][2] + "|" + board [0][3] + "|" + board [0][4] + "|" + board [0][5] + "|" + board [0][6] + "|" + board [0][7] + "|" + board [0][8] + "|" + board [0][9] + "| ");
	
	System.out.println("2  |" + board [1][0] +  "|" + board [1][1] + "|" + board [1][2] + "|" + board [1][3] + "|" + board [1][4] + "|" + board [1][5] + "|" + board [1][6] + "|" + board [1][7] + "|" + board [1][8] + "|" + board [1][9] + "| ");
	
	System.out.println("3  |" + board [2][0] +  "|" + board [2][1] + "|" + board [2][2] + "|" + board [2][3] + "|" + board [2][4] + "|" + board [2][5] + "|" + board [2][6] + "|" + board [2][7] + "|" + board [2][8] + "|" + board [2][9] + "| ");
	
	System.out.println("4  |" + board [3][0] +  "|" + board [3][1] + "|" + board [3][2] + "|" + board [3][3] + "|" + board [3][4] + "|" + board [3][5] + "|" + board [3][6] + "|" + board [3][7] + "|" + board [3][8] + "|" + board [3][9] + "| ");
	
	System.out.println("5  |" + board [4][0] +  "|" + board [4][1] + "|" + board [4][2] + "|" + board [4][3] + "|" + board [4][4] + "|" + board [4][5] + "|" + board [4][6] + "|" + board [4][7] + "|" + board [4][8] + "|" + board [4][9] + "| ");
	
	System.out.println("6  |" + board [5][0] +  "|" + board [5][1] + "|" + board [5][2] + "|" + board [5][3] + "|" + board [5][4] + "|" + board [5][5] + "|" + board [5][6] + "|" + board [5][7] + "|" + board [5][8] + "|" + board [5][9] + "| ");
	
	System.out.println("7  |" + board [6][0] +  "|" + board [6][1] + "|" + board [6][2] + "|" + board [6][3] + "|" + board [6][4] + "|" + board [6][5] + "|" + board [6][6] + "|" + board [6][7] + "|" + board [6][8] + "|" + board [6][9] + "| ");
	
	System.out.println("8  |" + board [7][0] +  "|" + board [7][1] + "|" + board [7][2] + "|" + board [7][3] + "|" + board [7][4] + "|" + board [7][5] + "|" + board [7][6] + "|" + board [7][7] + "|" + board [7][8] + "|" + board [7][9] + "| ");
	
	System.out.println("9  |" + board [8][0] +  "|" + board [8][1] + "|" + board [8][2] + "|" + board [8][3] + "|" + board [8][4] + "|" + board [8][5] + "|" + board [8][6] + "|" + board [8][7] + "|" + board [8][8] + "|" + board [8][9] + "| ");
	
	System.out.println("10 |" + board [9][0] +  "|" + board [9][1] + "|" + board [9][2] + "|" + board [9][3] + "|" + board [9][4] + "|" + board [9][5] + "|" + board [9][6] + "|" + board [9][7] + "|" + board [9][8] + "|" + board [9][9] + "| ");
	
	}
	
	System.out.println("\n\n\n\n\n\n   |1|2|3|4|5|6|7|8|9|10| "); //added numbers and letters to be more precise with the grid and more true to the original game
	System.out.println("1  |" + board [0][0] +  "|" + board [0][1] + "|" + board [0][2] + "|" + board [0][3] + "|" + board [0][4] + "|" + board [0][5] + "|" + board [0][6] + "|" + board [0][7] + "|" + board [0][8] + "|" + board [0][9] + "| ");
	
	System.out.println("2  |" + board [1][0] +  "|" + board [1][1] + "|" + board [1][2] + "|" + board [1][3] + "|" + board [1][4] + "|" + board [1][5] + "|" + board [1][6] + "|" + board [1][7] + "|" + board [1][8] + "|" + board [1][9] + "| ");
	
	System.out.println("3  |" + board [2][0] +  "|" + board [2][1] + "|" + board [2][2] + "|" + board [2][3] + "|" + board [2][4] + "|" + board [2][5] + "|" + board [2][6] + "|" + board [2][7] + "|" + board [2][8] + "|" + board [2][9] + "| ");
	
	System.out.println("4  |" + board [3][0] +  "|" + board [3][1] + "|" + board [3][2] + "|" + board [3][3] + "|" + board [3][4] + "|" + board [3][5] + "|" + board [3][6] + "|" + board [3][7] + "|" + board [3][8] + "|" + board [3][9] + "| ");
	
	System.out.println("5  |" + board [4][0] +  "|" + board [4][1] + "|" + board [4][2] + "|" + board [4][3] + "|" + board [4][4] + "|" + board [4][5] + "|" + board [4][6] + "|" + board [4][7] + "|" + board [4][8] + "|" + board [4][9] + "| ");
	
	System.out.println("6  |" + board [5][0] +  "|" + board [5][1] + "|" + board [5][2] + "|" + board [5][3] + "|" + board [5][4] + "|" + board [5][5] + "|" + board [5][6] + "|" + board [5][7] + "|" + board [5][8] + "|" + board [5][9] + "| ");
	
	System.out.println("7  |" + board [6][0] +  "|" + board [6][1] + "|" + board [6][2] + "|" + board [6][3] + "|" + board [6][4] + "|" + board [6][5] + "|" + board [6][6] + "|" + board [6][7] + "|" + board [6][8] + "|" + board [6][9] + "| ");
	
	System.out.println("8  |" + board [7][0] +  "|" + board [7][1] + "|" + board [7][2] + "|" + board [7][3] + "|" + board [7][4] + "|" + board [7][5] + "|" + board [7][6] + "|" + board [7][7] + "|" + board [7][8] + "|" + board [7][9] + "| ");
	
	System.out.println("9  |" + board [8][0] +  "|" + board [8][1] + "|" + board [8][2] + "|" + board [8][3] + "|" + board [8][4] + "|" + board [8][5] + "|" + board [8][6] + "|" + board [8][7] + "|" + board [8][8] + "|" + board [8][9] + "| ");
	
	System.out.println("10 |" + board [9][0] +  "|" + board [9][1] + "|" + board [9][2] + "|" + board [9][3] + "|" + board [9][4] + "|" + board [9][5] + "|" + board [9][6] + "|" + board [9][7] + "|" + board [9][8] + "|" + board [9][9] + "| ");
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
