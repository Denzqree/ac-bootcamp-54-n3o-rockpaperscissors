package org.academiadecodigo.org.bootcamp54.rockpaperscissors;

/**
 * Created by codecadet on 28/09/2020.
 */
public class Player {

    private String name;
    private Generator generator;
    private int score;
    private Hand hand;

    public Player(String name, Generator generator){
        this.name = name;
        this.generator = generator;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Hand chooseHand() {
        int generatedValue = generator.generate();
        return Hand.showHands()[generatedValue];
    }

    public void win() {

    }
}
