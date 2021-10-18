//handles each ship object

//SUDO CODE/PLAN FOR THIS CLASS:
//So from the Board class, 3 ship instances get called with 3, 4, and 5 as the lengths. Each ship has their own
//corresponding letter so ship3 will be represented with A's, ship4 with B's, etc. And if the marker is in the same place
//as one of the ships in the 2d array, then something like ship3.hit() will be called. That function will reduce the lives
//of said ship as it's character (a, b or c) will turn into a 0 on the board. Once the ship runs out of lives, it is dead so
//the function just returns true for dead (that also means when the function ship.hit() is called, it will need to be
//stored in a boolean variable).

public class Ship {
    int lives;

    //passes through length of the ship, which is essentially how many lives it has
    public Ship (int length){
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
