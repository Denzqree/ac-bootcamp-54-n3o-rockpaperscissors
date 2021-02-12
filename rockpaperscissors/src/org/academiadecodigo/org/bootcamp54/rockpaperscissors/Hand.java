package org.academiadecodigo.org.bootcamp54.rockpaperscissors;

/**
 * Created by codecadet on 28/09/2020.
 */
public enum Hand {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int handIndex;

    Hand(int handIndex) {
        this.handIndex = handIndex;
    }

    public int getHandIndex() {
        return handIndex;
    }

    public static Hand[] showHands() {
        return Hand.values();
    }

}
