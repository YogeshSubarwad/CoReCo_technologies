package Basic;
/*
Teamwork Tile Tactics
In a board game, a piece may advance 1-6 tiles forward depending on the number rolled on a six-sided dice.
If you advance your piece onto the "same tile" as another player's piece, both of you earn a bonus.

Given you and your friend's tile number (in same order),
create a function that returns if it's possible to earn a bonus when you roll the dice or not.

Examples
possibleBonus(3, 7) ➞ true
possibleBonus(1, 9) ➞ false
possibleBonus(5, 3) ➞ false

Notes:
* You cannot move backward.
* If you are already on the same tile, return false.
* Expect only positive integer inputs
 */

public class TeamWorkTile {
    public static void possibleBouns(int yourTile, int friendTile) {

        //Check if you cannot move backward, and you are not already on the same tile
        if (yourTile < friendTile && friendTile <= yourTile + 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


    public static void main(String[] args) {
        possibleBouns(3,7);
        possibleBouns(1,9);
        possibleBouns(5,3);
    }
}
