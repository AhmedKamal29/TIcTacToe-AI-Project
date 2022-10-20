/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 */
public class Person extends Gamer { // person is the class responsible for all the actions of the player 

    public Person() {
    }

    public void yourMove(String[][] MoveLocation) { // a function that sets the location of the players move 

        boolean turn = true; // a varibale that identifies weather it is the player move or the AI agent move 
        Scanner sc = new Scanner(System.in);

        while (turn) { // as long as it is the players move do the following stack of actions 
            System.out.println("Enter your Move Row:");
            int row = sc.nextInt(); //takes the row location of the desired move 
            System.out.println("Enter your Move column:");
            int column = sc.nextInt();//takes the column location of the desired move

            System.out.println("your Move Location is:");
            System.out.println("Row: " + row);
            System.out.println("Column: " + column);
            // Displays the details of the player's Move 

            if (!MoveLocation[row - 1][column - 1].equals("x") && !MoveLocation[row - 1][column - 1].equals("o")) {
                //determine if the specifc slot is free to set markers
                MoveLocation[row - 1][column - 1] = Position;
                turn = false; // rturn false to switch players
            } else { // else invalid postition

                System.out.println("Invalid position ... Choose another");

            }
        }

    }
}
