import java.util.Scanner;

public class Ship {
    int lives;
    public Ship (length){
        int lives = length;
    }

    public boolean hit(){
        lives--;
        if(lives <= 0){
            return true;
        }
        return false;
    }
}
