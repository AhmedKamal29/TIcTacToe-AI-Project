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
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome To Tic-Tac-Toe!!! Enjoy Playing ;)");
        System.out.println();

        //create the playable characters 
        int X = 1;
        int O = 2;
        boolean AnotherGame = true;

        Scanner sc = new Scanner(System.in);

        // Creates player1 1 and Com players  
        Person player1 = new Person();
        AIAgent com = new AIAgent();

        while (AnotherGame) {
            //run board BoardLayoutup
            BoardLayout Draw = new BoardLayout();

            Draw.Board();
            Draw.PrintBoard();

            System.out.println("please choose your marker:");
            System.out.println("type 1 for 'x' or 2 for 'o'");

            //BoardLayout markers
            if (sc.nextInt() == 1) {
                
                // create player objects
                player1.setPosition("x");
                com.setPosition("o");
            } else {
                player1.setPosition("o");
                com.setPosition("x");

            }

            
            // determine who goes first
            int first = (int) (Math.random() * 2);
            boolean win = false;
            int turns = 0;

            if (first == 0) {
                System.out.println();
                while (!win) {
                    player1.yourMove(Draw.getLayout());
                    turns++;
                    Draw.PrintBoard();
                    if (Draw.YouWon(Draw.getLayout())) {
                        win = true;
                        System.out.println("Winner Winner Chicken Dinner");
                    }
                    if (turns == 9) {
                        win = true;
                        System.out.println("Shame!! You draw with an AI");
                        break;
                    }
                    if (!win) {
                        com.makeMove(Draw.getLayout(), player1);
                        turns++;
                        System.out.println();
                        Draw.PrintBoard();
                        System.out.println();
                        if (Draw.YouWon(Draw.getLayout())) {
                            win = true;
                            System.out.println("Comeback when you grow a brain");
                        }
                        if (turns == 9) {
                            win = true;
                            System.out.println("Shame!! You draw with an AI");
                            break;
                        }
                    }

                }  
                
              // end of while 1
            } else {

                System.out.println("Peasent!! Machines Goes First");
                System.out.println();
                while (!win) {
                    com.makeMove(Draw.getLayout(), player1);
                    turns++;
                    Draw.PrintBoard();
                    if (Draw.YouWon(Draw.getLayout())) {
                        win = true;
                        System.out.println("Comeback when you grow a brain");
                    }
                    if (turns == 9) {
                        win = true;
                        System.out.println("Shame!! You draw with an AI");
                        break;
                    }
                    if (!win) {
                        player1.yourMove(Draw.getLayout());
                        turns++;
                        System.out.println();
                        Draw.PrintBoard();
                        System.out.println();
                        if (Draw.YouWon(Draw.getLayout())) {
                            win = true;
                            System.out.println("Winner Winner Chicken Dinner ");
                        }
                        if (turns == 9) {
                            win = true;
                            System.out.println("Shame!! You draw with an AI");
                            break;
                        }
                    }
                }  // close while 2

            }

            System.out.println("Did You grow a brain? .. test it out ... Type 1 for yes or 2 to quit");
            System.out.println();
            if (sc.nextInt() == 2) {
                AnotherGame = false;
            }
        }
    }
}
