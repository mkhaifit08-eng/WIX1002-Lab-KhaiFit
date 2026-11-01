/*
    Write a simple two players dice game. Each player will take turns to roll a dice. The
    first players that reach more than 100 points win the game. If the player rolls a 6, the
    player will score 6 points and has the chance to roll again.

 */

package lab4;

import java.util.Random;

public class L4Q5R {
    public static void main(String[] Args){
        Random rand = new Random();
        int sum_P1=0, sum_P2=0, dice_P1, dice_P2;
        

        while(sum_P1 <= 100 && sum_P2 <= 100){
            
            dice_P1 = rand.nextInt(6)+1;
            System.out.println("Player 1, you have thrown: " + dice_P1);
            sum_P1 +=dice_P1;
            if(dice_P1 == 6){
                System.out.println("Player 1, you have chance to throw the dice again");
                dice_P1 = rand.nextInt(6)+1;
                System.out.println("Player 1, you have thrown: " + dice_P1);
                sum_P1 +=dice_P1;
            }
            System.out.println("Current Player 1 sum: "+ sum_P1);
            System.out.println();

            dice_P2 = rand.nextInt(6)+1;
            System.out.println("Player 2, you have thrown: " + dice_P2);
            sum_P2 +=dice_P2;
            if(dice_P2 == 6){
                System.out.println("Player 2, you have chance to throw the dice again");
                dice_P2 = rand.nextInt(6)+1;
                System.out.println("Player 2, you have thrown: " + dice_P2);
                sum_P2 +=dice_P2;
            }
            System.out.println("Current Player 2 sum: "+ sum_P2);
            System.out.println();

        }

        String winner = (sum_P1> sum_P2)? "Player 1":"Player 2";
        System.out.printf("%s %s %s%n","-".repeat(20),"FINAL RESULT","-".repeat(20));
        System.out.printf("%10s: %d%n", "Player 1 score", sum_P1);
        System.out.printf("%10s: %d%n", "Player 2 score", sum_P2);
        System.out.printf("%10s: %s%n", "The winner is: ", winner);

    }
}
