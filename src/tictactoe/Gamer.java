/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 */

// parent class to set the position of the persons move 
public class Gamer {
    
    public String Position; 

    //default Constructor 
    public Gamer() {
    }

    //overloaded Constructor 
    public Gamer(String Position) {
        this.Position = Position;
    }

    //setter
    public void setPosition(String Position) {
        this.Position = Position;
    }

    //getter
    public String getPosition() {
        return Position;
    }
    
    
}
