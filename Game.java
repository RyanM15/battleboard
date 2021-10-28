public class Game{
	
	PlayerBoard pboard = new PlayerBoard();
	GuessBoard gboard = new GuessBoard();
	ComputerBoard cboard = new ComputerBoard();
	public void play(){
		
		pboard.placeShips();
		cboard.placeShips();
		boolean win = guess();
		return win;
	}
	public boolean guess(){
		int hit = ComputerBoard.playerGuess(row, col);
		if(hit == 3){
			return true;
		}
		gboard.placeMarker(row, col, hit);
		boolean lost = pboard.computerGuess();
		if(lost == true){
			return false;
		}else{
			guess();
		}
	}
}
