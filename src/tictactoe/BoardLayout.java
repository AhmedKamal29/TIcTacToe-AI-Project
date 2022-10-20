/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 */
public class BoardLayout {

    private int size = 3; //default size for the  board 
    public String[][] Layout = new String[size][size]; // board Layout 2D array 

    public boolean YouWon(String[][] Layout) {

        //Horizonatlly winning 
        // if a whole row is equal to each other its a win 
        for (int i = 0; i < 3; i++) {
            if (Layout[i][0].equals(Layout[i][1]) && Layout[i][1].equals(Layout[i][2])) {
                return true;
            }
        }

        //vertically winning
        // if a whole column is equakl to each other its a win 
        for (int i = 0; i < 3; i++) {
            if (Layout[0][i].equals(Layout[1][i]) && Layout[1][i].equals(Layout[2][i])) {
                return true;
            }
        }

        //diagonal
        // if the center position is equal to the upper left and lower right its a win 
        // if the center position is equal to the upper rigth and lower left its a win  
        if (Layout[0][0].equals(Layout[1][1]) && Layout[1][1].equals(Layout[2][2]) || Layout[2][0].equals(Layout[1][1]) && Layout[1][1].equals(Layout[0][2])) {
            return true;
        }
        return false;
    }
    int numbering = 1;

    public void Board() {

        // Creating a board of 3x3 layout by 2 nested for loops and prints numbering for every position
        for (int i = 0; i < Layout.length; i++) {
            for (int j = 0; j < Layout.length; j++) {
                Layout[i][j] = "" + (numbering);
                numbering++;
            }
        }
    }

    public void PrintBoard() {
        //Looping on the 2D Layout Array to print the 3x3 board 
        for (int i = 0; i < Layout.length; i++) {
            for (int j = 0; j < Layout.length; j++) {
                System.out.print("{" + Layout[i][j] + "}" + " ");
            }
            System.out.println();
        }
    }

    public String[][] getLayout() {
        return Layout;
    }
}
