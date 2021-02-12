package org.academiadecodigo.org.bootcamp54.rockpaperscissors;

/**
 * Created by codecadet on 25/09/2020.
 */
public class Generator {

    // Declaring the new Constructor with a game for the reference in method generate()
    public Generator(){
    }
    // Declaring the methods
    ////////////////////////

    // Generate
    public int generate() {
        return (int) Math.floor((Math.random() * 2));
    }
}
