import java.util.Scanner;
//this is the player board class which handles the playerboard and the placing of the player's ships and the computer's guess
public class PlayerBoard{
    char [][] board = new char[10][10];
    char[][] cheat = new char[10][10];
    Scanner scan = new Scanner(System.in);
 	Scanner scan2 = new Scanner(System.in);
    boolean placed = false;
    int rowPos;
    int colPos;
    int pastRowGuess;
    int pastColGuess;
    int aPieces = 3;
    int bPieces = 4;
    int cPieces = 5;
    double orientation = 0;
    double direction = 0;
    //the player chooses where to place the ships
	public void placeShips(){
        System.out.println("Lets place some ships!");
        System.out.println("This is what your board looks like:");
      

	    for (int r = 0; r < 10; r++)//rows
	    {
	    	for (int c = 0; c < 10; c++)//columns
	    	{
	    	    board[r][c] = ' ';
		    }
	    }

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
        placed = false;
        for(int i=0; i<3;i++){
            while (placed == false){
                placed = placePart(3, 'a', i+1);
            }
            placed=false;
        }
        placed = false;
        for(int i=0; i<4;i++){
            while (placed == false){
                placed = placePart(4, 'b', i+1);
            }
            placed=false;
        }
        placed = false;
        for(int i=0; i<5;i++){
            while (placed == false){
                placed = placePart(5, 'c', i+1);
            }
            placed=false;
        }

    
 		
 		
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



			cheat = board;
	    }

    //this handles the placing of a singular part of a certain ship, called by placeShips() function, makes it easier to spot a player error
        public boolean placePart(int length, char letter, int currentLength){
            String gram = "th";
            switch(currentLength){
                case 1: gram = "st"; break;
                case 2: gram = "nd"; break;
                case 3: gram = "rd"; break;
            }
                System.out.print("Ship "+(length-2)+" (length "+length+"): choose the vertical position of the " + currentLength + gram +" part:");
                rowPos = scan.nextInt();
                System.out.print("Ship (length "+length+"): choose the horizontal position of the " + currentLength + gram+" part:");
                colPos = scan2.nextInt();

                //below are if-statements that handle player errors
                if(rowPos>9 || rowPos<0 ||colPos>9 || colPos<0){
                    System.out.println("Uh oh! You placed a ship part outside of the grid! Make sure both your vertical and ");
                    System.out.println("horizontal position are between 0-9 (inclusive). Try again... ");
                    return false;
                }
                if(board[rowPos][colPos] != ' '){
                    System.out.println("Oops! Looks like a part of one of your ships is already placed there. Try again...");
                    return false;
                }

                board[rowPos][colPos] = letter;
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
                int rowAdd = 1;
                int rowSub = 1;
                int colAdd = 1;
                int colSub = 1;
                if(rowPos == 0){
                    rowSub = 0;
                }
                if(rowPos == 9){
                    rowAdd = 0;
                }
                if(colPos == 0){
                    colSub = 0;
                }
                if(colPos == 9){
                    colAdd = 0;
                }
                board[rowPos][colPos] = 'i';
                if(currentLength!=1){
                    if(board[rowPos-rowSub][colPos] != letter && board[rowPos+rowAdd][colPos] != letter && board[rowPos][colPos-colSub] != letter && board[rowPos][colPos+colAdd] != letter){
                    System.out.println("Bruh...Make sure all of your corresponding ship parts are next to each other. Try again...");
                    board[rowPos][colPos] = ' ';
                    return false;
                }
                }
                board[rowPos][colPos] = letter;
                //here, im making sure the ship is in a straight line. A counter counts how many times
                //a ship's letter appears in a row. If the number of times is less than the current number
                //of placed letters but greater than 1, then the ship must be crooked
                int highestCount = 0;
                for(int j=0;j<10;j++){
                    int counter = 0;
                    for(int m=0; m<10;m++){
                        if(board[j][m] == letter){
                            counter++;
                        }
                    }
                    if(counter>highestCount){
                        highestCount=counter;
                    }
                }
                if(highestCount<currentLength && highestCount > 1){
                    System.out.println("Dude...Your ship's parts must be in a straight line. Try again...");
                    board[rowPos][colPos] = ' ';
                    return false;
                }
                
                return true;
                
        }
		//this is the computer guess class where the computer already knows the position of all the ships, but its a 
        //matter of the likelihood of it choosing to guess the correct answer (but this system is a secret to the player)
		public boolean computerGuess(){
        //less pieces -> higher likelihood
        
        if(cPieces>0){
            if(bPieces>0){
                if(aPieces>0){
                    if(Math.random() *100>aPieces*33 - 35){
                        System.out.println("-----------------------------------------");
                        System.out.println("Oh No! The enemy has hit your ship!");
                        System.out.println("-----------------------------------------");
                        deleteLetter('a');
                        aPieces--;
                    }else{
                        System.out.println("-----------------------------------------");
                        System.out.println("The enemy has missed lol");
                        System.out.println("-----------------------------------------");
                    }
                } else{
                    if(Math.random()*100>bPieces*25 - 27){
                        System.out.println("-----------------------------------------");
                        System.out.println("Oh No! The enemy has hit your ship!");
                        System.out.println("-----------------------------------------");
                        deleteLetter('b');
                        bPieces--;
                    }else{
                        System.out.println("-----------------------------------------");
                        System.out.println("The enemy has missed lol");
                        System.out.println("-----------------------------------------");
                    }
                }
            }else{
                if(Math.random()*100>cPieces*20 - 22){
                    System.out.println("-----------------------------------------");
                    System.out.println("Oh No! The enemy has hit your ship!");
                    System.out.println("-----------------------------------------");
                        deleteLetter('c');
                        cPieces--;
                    }else{
                        System.out.println("-----------------------------------------");
                        System.out.println("The enemy has missed lol");
                        System.out.println("-----------------------------------------");
                    }
            }
        }

        if(aPieces==0){
            System.out.println("-----------------------------------------");
            System.out.println("They sunk one of your battleships!");
            System.out.println("-----------------------------------------");
            aPieces=-1;
        }
        if(bPieces==0){
            System.out.println("-----------------------------------------");
            System.out.println("They sunk one of your battleships!");
            System.out.println("-----------------------------------------");
            bPieces=-1;
        }
        if(cPieces==0){
            System.out.println("-----------------------------------------");
            System.out.println("They sunk one of your battleships!");
            System.out.println("-----------------------------------------");
            cPieces=-1;
        }

        

        System.out.println("YOUR SHIPS");//board for player ships
	    System.out.println("  |0|1|2|3|4|5|6|7|8|9| ");
	    for (int r = 0; r < 10; r++)//rows
		{
			System.out.print(r + " |");
			for (int c = 0; c < 10; c++)//columns
			{	
			System.out.print( cheat[r][c]+ "|" );
		}
		System.out.println("");
		}
        if(bPieces<=0 && cPieces<=0 && aPieces<=0){
            return true;
        }

        return false;
    }
    //deletes a certain char, called from computerGuess();
    public void deleteLetter(char letter){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(cheat[i][j]==letter){
                    cheat[i][j] = 'x';
                    return;
                }
            }
        }
    }
    //handles the blitz game aspect with randomly placing ships
    public void randomShips(){
        for (int r = 0; r < 10; r++)//rows
	    {
	    	for (int c = 0; c < 10; c++)//columns
	    	{
	    	    board[r][c] = ' ';
		    }
	    }

        placed = false;
        while (placed == false){
            boolean p = ship(3, 'a');
            if(p){
                placed = true;
            }
        }
        placed = false;
        while (placed == false){
            boolean p = ship(4, 'b');
            if(p){
                placed = true;
            }
        }
        placed = false;
        while (placed == false){
            boolean p = ship(5, 'c');
            if(p){
                placed = true;
            }
        }
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
        cheat = board;
       
    }
    //places a singular ship with random orientation and direction
    public boolean ship(int length, char letter){
        for(int i = 0; i<length; i++){
                if(i==0){
                    rowPos = ((int) (Math.random() * (9 - 0)) + 0);
                    colPos = ((int) (Math.random() * (9 - 0)) + 0);
                    orientation = Math.random();
                    direction = Math.random();
                    if(orientation > .5){
                        if(colPos + (length-1) > 9){
                            direction=-1;
                        }
                        if(colPos - (length-1) < 0){
                            direction=1;
                        }
                    }else{
                         if(rowPos + (length-1) > 9){
                            direction=-1;
                        }
                        if(rowPos - (length-1) < 0){
                            direction=1;
                        }
                    }
                }else{
                    if(orientation > .5){//change columns
                        if(direction > .5){//add
                            colPos++;
                        }else{//subtract
                            colPos--;
                        }
                    }else{//change rows   
                        if(direction > .5){//add
                            rowPos++;
                        }else{//subtract
                            rowPos--;
                        }
                    }
                }
                if(board[rowPos][colPos] != ' '){
                    if(orientation>.5){
                        for(int j=0;j<9;j++){
                            if(board[rowPos][j] == letter){
                                board[rowPos][j] = ' ';
                            }
                        }
                    }else{
                        for(int k=0;k<9;k++){
                            if(board[k][colPos] == letter){
                                board[k][colPos] = ' ';
                            }
                        }
                    }
                    return false;
                }
                board[rowPos][colPos] = letter;

               
            }
            return true;
    }
 

 
	}
    
