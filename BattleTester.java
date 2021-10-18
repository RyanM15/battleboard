import java.util.Scanner;

public class BattleTester {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi! Welcome to Battleboard\n Press W to continue");
		String next = scan.nextLine();
		
		if (next.equals("W")|| next.equals("w")) {
			System.out.println("Do you know how to play? \nIf yes, press Y\nIf no press N:");
			String knowYN = scan.nextLine();
			
			if (knowYN.equals("y") || knowYN.equals("Y")) {
				understood();
			}
			if (knowYN.equals("n") || knowYN.equals("N")) {
				System.out.println("Here is how to play\n You have 3 ships and your opponent (the computer) has 3 as well\n You have to place your 3 ships on the 10 by 10 board vertically or horizontally\n After you have placed your ships you attempt to find your oppenets ships\n You do this by guessing coordinates on the board\n If you guess a coordinate that your oppenent has placed a ship the you will recieve a hit marker\n If you guess where a coordinate where no ship is evident then a miss marker will be shown");
				System.out.println("Do you understand?\nIf yes the press Y\nIf No press N:");
				String knowYN2 = scan.nextLine();
				
			if (knowYN2.equals("y") || knowYN2.equals("Y")) {
				
}

		else {
			System.out.print("Follow Directions!");
			}
		}
		}
	}
	public static void understood(){
		Scanner scan = new Scanner(System.in);
	System.out.println("Cool! You place your ships by placing a 3,4, or 5 long ship\nFirst you place your 3 coordinate long ship \n Then your 4 coordinate long ship \n Finally you place you 5 coordinate long ship\nTo place your ships list out the coordinates that you want your ship to be placed at\n Example: If you want your 3 coordinate long ship to be at D6 - D8, you would write this out as D6, D7, D8 \nWhere would you like to place your three coordinate long ship");
				String repeat = scan.nextLine();
				System.out.println("You chose to place your ship at " + repeat);
}

}
