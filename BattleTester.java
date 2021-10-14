import java.util.Scanner;

public class BattleTester {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi! Welcome to Battleboard\n Press W to continue");
		String next = scan.nextLine();
		
		if (next.equals("W") {
			System.out.println("Do you know how to play? \nIf yes, press y\n If no press n:");
			String knowYN = scan.nextLine();
			if (knowYN.equals(("y") || knowYN.equals("Y")) {
				System.out.println("Cool! You place your ships by ____\n Where would you like to place your ships");
			}
			if (knowYN.equals("n") || knowYN.equals("N")) {
				System.out.println("Here is how to play\n You have 3 ships and your opponent (the computer) has 3 as well\n You have to place your 3 ships on the 10 by 10 board vertically or horizontally\n After you have placed your ships you attempt to find your oppenets ships\n You do this by guessing coordinates on the board\n If you guess a coordinate that your oppenent has placed a ship the you will recieve a hit marker\n If you guess where there isn't a ship then a miss marker will be shown");
}
else {
	System.out.print("Follow Directions!");
}
}
}
