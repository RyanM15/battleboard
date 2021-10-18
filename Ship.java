//handles each ship object
import java.util.Scanner;

public class Ship {
    int lives;

    //passes through length of the ship, which is essentially how many lives it has
    public Ship (length){
        lives = length;
    }

    //gets called from another class and reduces the lives. Also returns true if it is dead or destroyed
    public boolean hit(){
        lives--;
        if(lives <= 0){
            return true;
        }
        return false;
    }
}
