package no.ntnu.idata2302.lab01;


/**
 * Represents a Rock, Scissor, Paper class. And checks who wins of
 * player1 and player 2.
 *
 * @author Even J.P Haslerud
 * @version 24.10.2022
 */
public class RSP {

    // Defining the different values for the different possibilities
    public static final short ROCK = 0;
    public static final short SCISSOR = 1;
    public static final short PAPER = 2;

    /**
     * Will return the player who wins.
     *
     * @param player1 player 1 in the game of RSP
     * @param player2 player 2 in the game of RSP
     * @return the winner of the game
     */
    public static short whoWins(short player1, short player2){
        return WINNER[player1][player2];
    }

    /**
     * 2D array to get the result. The rows
     * represent player1 and the column represent player2.
     */
    public static final short[][] WINNER = {
        {0, 1, 2},
        {2, 0, 1},
        {1, 2, 0}
    };

}
