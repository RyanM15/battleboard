public class ComputerBoard{
    char [][] board = new char[10][10];
    int rowPos = 0;
    int colPos = 0;
    boolean placed = false;
    double orientation = 0;
    double direction = 0;
    //handles placing ships
    public void placeShips(){
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
        
       
    }
    //individual ships being placed randomly
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
    //handles the player's guess of where the computer ships are
    public int playerGuess(int row, int col){

	int totalShips = 12;

	if (board[row][col] == 'a' || board[row][col] == 'b' || board[row][col] == 'c')
	{
		totalShips--;
		if (totalShips == 0)
		{
           
			return 3;
		}
		else 
		{
			board[row][col] = ' ';
         
			return 1;
		}
	}
	else
	{
		board[row][col] = ' ';
     
		return 0;
	}
	
	
}
}
