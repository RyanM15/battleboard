public int playerGuess(int row, int col){
	board[3][4] = 'a';
	
	
	int totalShips = 1;
	
	
	
	
	if (board [row][col] == 'a')
	{
		totalShips--;
		if (totalShips == 0)
		{
			return 3;
		}
		else 
		{
			//replace that part of computer board with a zero
			board[row][col] = 1;
			return 1;
			
		}
		
		
	}
	else
	{
		board[row][col] = 0;
		return 0;
		
	}
	
	
}
	
