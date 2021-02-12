package org.academiadecodigo.org.bootcamp54.rockpaperscissors;

/**
 * Created by codecadet on 28/09/2020.
 */
public class Main {

    public static void main(String[] args) {

        int numberOfRounds = 3;

        String playerOneName = "Tone";
        String playerTwoName = "Francisco";

        Player[] players = new Player[2];

        Generator generator = new Generator();

        Player playerOne = new Player(playerOneName,generator);
        Player playerTwo = new Player(playerTwoName,generator);

        Game gameOne = new Game(playerOne, playerTwo, numberOfRounds);

        gameOne.start();

    }
}
