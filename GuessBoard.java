
//handles showing the viewer their guess board
//this class was made by Kai, but bc of saving issues, it was recreated by Daniel remembering Kai's layout
public class GuessBoard{
    char [][] board = new char[10][10];
	//makes board
    public void makeBoard(){
        for (int r = 0; r < 10; r++)//rows
	    {
	    	for (int c = 0; c < 10; c++)//columns
	    	{
	    	    board[r][c] = ' ';
		    }
	    }
    }
	//places marker on board;
    public void placeMarker(int row, int col, int hit){
        

        char marker = ' ';
        if(hit==1){
            marker = 'x';
        }else{
            marker = 'o';
        }
        board[row][col] = marker;

        System.out.println("YOUR GUESS BOARD");//board for player ships
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
