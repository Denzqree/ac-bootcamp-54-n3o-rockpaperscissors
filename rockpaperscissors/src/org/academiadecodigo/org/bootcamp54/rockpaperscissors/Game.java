package org.academiadecodigo.org.bootcamp54.rockpaperscissors;

/**
 * Created by codecadet on 28/09/2020.
 */
public class Game {

    private Player playerOne;
    private Player playerTwo;
    private Player roundWinner;
    private boolean hasDraw;
    private Player bestOf;
    private int numberOfRounds;

    public Game(Player playerOne, Player playerTwo, int numberOfRounds){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.numberOfRounds = numberOfRounds;
    }

    public void start(){

        for(int round = 1; round <= numberOfRounds; round++) {

            System.out.println(round+" "+numberOfRounds);

            roundWinner = null;
            // START THE ROUND WITH PLAYERS CHOOSING A SIGN OUT OF ROCK PAPERS AND SCISSORS
            Hand playerOneChoice = playerOne.chooseHand();
            Hand playerTwoChoice = playerTwo.chooseHand();

            System.out.println(playerOne.getName() + " chose " + playerOneChoice);
            System.out.println(playerTwo.getName() + " chose " + playerTwoChoice);

            // NOW WE'RE COMPARING THE RESULTS
            if(playerOneChoice != playerTwoChoice) {
                if (playerOneChoice == Hand.ROCK && playerTwoChoice == Hand.PAPER) {
                    roundWinner = playerTwo;
                } else if (playerOneChoice == Hand.ROCK && playerTwoChoice == Hand.SCISSORS) {
                    roundWinner = playerOne;
                } else if (playerOneChoice == Hand.PAPER && playerTwoChoice == Hand.ROCK) {
                    roundWinner = playerOne;
                } else if (playerOneChoice == Hand.PAPER && playerTwoChoice == Hand.SCISSORS) {
                    roundWinner = playerTwo;
                } else if (playerOneChoice == Hand.SCISSORS && playerTwoChoice == Hand.PAPER) {
                    roundWinner = playerOne;
                } else if (playerOneChoice == Hand.SCISSORS && playerTwoChoice == Hand.ROCK) {
                    roundWinner = playerTwo;
                }
            }else{
                roundWinner = null;
                System.out.println("Players draw!");
                hasDraw = true;
            }

            if(hasDraw != true){

            if (roundWinner != null) {
                System.out.println(roundWinner.getName() + " has won this round !");
                roundWinner.setScore(roundWinner.getScore() + 1);
            }

            if(playerOne.getScore() == 3){
                bestOf = playerOne;
                break;
            }else if(playerTwo.getScore() == 3){
                bestOf = playerTwo;
                break;
            }
            }else{
                break;
            }
        }

        if(bestOf != null){
            System.out.println(bestOf.getName()+" won the game !!!! MERRY EVERYTHING");
        }



    }



}
