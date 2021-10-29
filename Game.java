import java.util.Scanner;
//this is the 2nd most abstracted class and handles the core of layout of the game
public class Game{
	PlayerBoard pboard = new PlayerBoard();
	GuessBoard gboard = new GuessBoard();
	ComputerBoard cboard = new ComputerBoard();
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    Scanner scan3 = new Scanner(System.in);
    Scanner scan4 = new Scanner(System.in);
    int row;
    int col;
    boolean over = false;
    boolean win;
    //begins a game
	public boolean play(){

        System.out.print("\n\n\n\n\n\nPress 1 to play a regular game, press 2 to play a blitz game:");
        int gamemode = scan4.nextInt();
        if(gamemode==1){
            System.out.print("Regular game it is! Press Enter to Continue: ");
            scan.nextLine();
            pboard.placeShips();
        }else{
            System.out.print("Blitz game it is! Press Enter to Continue: ");
            scan.nextLine();
            pboard.randomShips();
        }
        
		
        System.out.println("Your ships are placed quite nicely! Your opponent has also finished placing their ships as well");
        System.out.print("Press Enter to start the battle!: ");
        scan.nextLine();
		cboard.placeShips();
        gboard.makeBoard();
        while (!over){
            over = guess();
        }
		
		return win;
	}
    //this function cycles and provides the guessing cycle for the game
	public boolean guess(){
        System.out.print("Guess the vertical position of one of their ship's parts: ");
        row = scan.nextInt();
        scan.nextLine();
        System.out.print("Guess the horizontal position of one of their ship's parts: ");
        col = scan.nextInt();

		int hit = cboard.playerGuess(row, col);
     
        switch(hit){
            case 0: 
                System.out.println("-----------------------------------------");
                System.out.println("You missed :(");
                System.out.println("-----------------------------------------");
                break;
            case 1: 
            System.out.println("-----------------------------------------");
                System.out.println("You hit a ship!!!!");
                System.out.println("-----------------------------------------");
                break;
            case 3: 
                win = true;
			    return true;
                
        }
        
		gboard.placeMarker(row,col, hit);
        
        System.out.println("Now it's the enemy's turn...");
        System.out.print("Press Enter to Continue: ");
        scan2.nextLine();
		boolean lost = pboard.computerGuess();
		if(lost == true){
            win = false;
			return true;
		} 
        System.out.print("Press Enter to Continue: ");
        scan3.nextLine();
		return false;
		
	}
}
