/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 */
public class AIAgent extends Gamer {

    public AIAgent() {
    }

    public void makeMove(String[][] Layout, Person G) { // function that gives the AI agent teh turn to make a move 

        int ver, hor, dia = 0; // ver for vertical , hor for horizontal , dia for diagonal
        boolean Move = false; // variable to check if the AI Agent made a move or not 

        // Horizontal win 
        for (int i = 0; i < 3; i++) { // for loop to check if a win could be achieved horizontaly
            if (Layout[0][i].equals(Layout[1][i]) && Layout[0][i].equals(Position)) { // if first row and column (i) is equal second row and column (i) , and first row and column (i) has a player's move 
                if (Layout[2][i] != G.getPosition() && Layout[2][i] != Position) { // if third row and column (i) doesnot contain a players move and third Row and column (i) doesnot contain agents move 
                    Layout[2][i] = Position; // place a move 
                    Move = true; // turn taken 
                    return;
                }
            }
        }
        for (int i = 0; i < 3; i++) { // for loop to check if a win could be achieved horizontaly
            if (Layout[2][i].equals(Layout[1][i]) && Layout[2][i].equals(Position)) { // if third row and column (i) is equal second row and column (i) , and third row and column (i) has a player's move 
                if (Layout[0][i] != G.getPosition() && Layout[0][i] != Position) { //if first row and column (i) doesnot contain a players move and first Row and column (i) doesnot contain agents move 
                    Layout[0][i] = Position; // place a move 
                    Move = true;// turn taken 
                    return;
                }
            }
        }

        // Vertical win
        for (int i = 0; i < 3; i++) {// for loop to check if a win could be achieved Verticaly
            if (Layout[i][0].equals(Layout[i][1]) && Layout[i][0].equals(Position)) {  // if (i) row and third column is equal (i) row and second  column  , and (i) row and third column has a player's move 
                if (Layout[i][2] != G.getPosition() && Layout[i][2] != Position) { // if (i) row and first column doesnot contain a players move and (i) Row and first column doesnot contain agents move 
                    Layout[i][2] = Position; // place a move 
                    Move = true; // turn taken 
                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {// for loop to check if a win could be achieved Verticaly
            if (Layout[i][2].equals(Layout[i][1]) && Layout[i][2].equals(Position)) { // if (i) row and third column is equal (i) row and second column  , and (i) row and first column has a player's move 
                if (Layout[i][0] != G.getPosition() && Layout[i][0] != Position) { // if (i) row and first column doesnot contain a players move and (i) Row and first column doesnot contain agents move 
                    Layout[i][0] = Position;  // place a move
                    Move = true; // turn taken 
                    return;
                }
            }
        }

        // Diagonal win 
        // check the origin of the array with the upper left corrner of the layout 
        if (Layout[0][0].equals(Layout[1][1]) && Layout[0][0].equals(Position)) {
            if (Layout[2][2] != G.getPosition() && Layout[2][2] != Position) { // check if the lower right corner is available move
                Layout[2][2] = Position;
                Move = true;
                return;
            }
        }
        // check the origin of the array with the lower right corrner of the layout 
        if (Layout[2][2].equals(Layout[1][1]) && Layout[2][2].equals(Position)) {
            if (Layout[0][0] != G.getPosition() && Layout[0][0] != Position) { // check if the upper left corner is available move
                Layout[0][0] = Position;
                Move = true;
                return;
            }
        }

        if (Layout[0][0].equals(Layout[1][1]) && Layout[0][0].equals(Position)) {
            if (Layout[2][2] != G.getPosition() && Layout[2][2] != Position) {
                Layout[2][2] = Position;
                Move = true;
                return;
            }
        }
        
        //check the origiin of the array with the upper right cornenr of the layout 
        if (Layout[0][2].equals(Layout[1][1]) && Layout[0][2].equals(Position)) {
            if (Layout[2][0] != G.getPosition() && Layout[2][0] != Position) { // check if the lower left corner is available move
                Layout[2][0] = Position;
                Move = true;
                return;
            }
        }

        

        //check the origiin of the array with the lower left cornenr of the layout
        if (Layout[2][0].equals(Layout[1][1]) && Layout[2][0].equals(Position)) {
            if (Layout[0][2] != G.getPosition() && Layout[0][2] != Position) {// check if the upper right corner is available move
                Layout[0][2] = Position;
                Move = true;
                return;
            }
        }

        //Blocking loops 
        // check if you can block a win horizontally
        for (int i = 0; i < 3; i++) {
            if (Layout[0][i].equals(Layout[1][i]) && Layout[0][i].equals(G.getPosition())) {
                if (Layout[2][i] != Position && Layout[2][i] != G.getPosition()) {
                    Layout[2][i] = Position;
                    Move = true;
                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (Layout[2][i].equals(Layout[1][i]) && Layout[0][i].equals(G.getPosition())) {
                if (Layout[0][i] != Position && Layout[0][i] != G.getPosition()) {
                    Layout[0][i] = Position;
                    Move = true;
                    return;
                }
            }
        }

        // check if you can block a win vertically
        for (int i = 0; i < 3; i++) {
            if (Layout[i][0].equals(Layout[i][1]) && Layout[i][0].equals(G.getPosition())) {
                if (Layout[i][2] != Position && Layout[i][2] != G.getPosition()) {
                    Layout[i][2] = Position;
                    Move = true;
                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (Layout[i][2].equals(Layout[i][1]) && Layout[i][2].equals(G.getPosition())) {
                if (Layout[i][0] != Position && Layout[i][0] != G.getPosition()) {
                    Layout[i][0] = Position;
                    Move = true;
                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (Layout[2][i].equals(Layout[1][i]) && Layout[2][i].equals(G.getPosition())) {
                if (Layout[0][i] != Position && Layout[0][i] != G.getPosition()) {
                    Layout[0][i] = Position;
                    Move = true;
                    return;
                }
            }
        }

        // check if you can block a win diagonally 
        if (Layout[0][0].equals(Layout[1][1]) && Layout[0][0].equals(G.getPosition())) {
            if (Layout[2][2] != Position && Layout[2][2] != G.getPosition()) {
                Layout[2][2] = Position;
                Move = true;
                return;
            }
        }
        if (Layout[2][2].equals(Layout[1][1]) && Layout[2][2].equals(G.getPosition())) {
            if (Layout[0][0] != Position && Layout[0][0] != G.getPosition()) {
                Layout[0][0] = Position;
                Move = true;
                return;
            }
        }
        if (Layout[0][0].equals(Layout[1][1]) && Layout[0][0].equals(G.getPosition())) {
            if (Layout[2][2] != Position && Layout[2][2] != G.getPosition()) {
                Layout[2][2] = Position;
                Move = true;
                return;
            }
        }
        if (Layout[0][2].equals(Layout[1][1]) && Layout[0][2].equals(G.getPosition())) {
            if (Layout[2][0] != Position && Layout[2][0] != G.getPosition()) {
                Layout[2][0] = Position;
                Move = true;
                return;
            }
        }
        if (Layout[2][0].equals(Layout[1][1]) && Layout[2][0].equals(G.getPosition())) {
            if (Layout[0][2] != Position && Layout[0][2] != G.getPosition()) {
                Layout[0][2] = Position;
                Move = true;
                return;
            }
        }

        // if none of all the rules apply .. make a random move 
        int randomRow = 0; // random row 
        int randomColumn = 0; // random column 
        while (!Move) { // as long as there is no moves taken 
            randomRow = (int) (Math.random() * 3); // generat random move 
            randomColumn = (int) (Math.random() * 3); // generate random move 

            if (Layout[randomRow][randomColumn] != "X" && Layout[randomRow][randomColumn] != "O") { // check if the random move doesnot already contain a move 
                Layout[randomRow][randomColumn] = Position; // set the move
                Move = true;

            }

        }

    }
}
