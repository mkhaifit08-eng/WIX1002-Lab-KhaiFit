/*
    Write a simple two players dice game. Each player will take turns to roll a dice. The
    first players that reach more than 100 points win the game. If the player rolls a 6, the
    player will score 6 points and has the chance to roll again.

 */

package lab4;

import java.util.Scanner;

public class L4Q5I{
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int sum_P1=0, sum_P2=0, dice_P1, dice_P2;
        

        while(sum_P1 <= 100 && sum_P2 <= 100){
            boolean is_valid_P1, is_valid_P2;
            do{
                System.out.print("Player 1, Enter your throw here (1 to 6): ");
                dice_P1 = input.nextInt();
                is_valid_P1 = dice_P1>0 && dice_P1<=6;
                if(is_valid_P1) break;
                System.out.println("Invalid input, please try again");
            }while(!is_valid_P1);
            sum_P1 +=dice_P1;
            if(dice_P1 == 6){
                System.out.println("Player 1, you have chance to throw the dice again");
                do{
                    System.out.print("Enter your throw here (1 to 6): ");
                    dice_P1 = input.nextInt();
                    is_valid_P1 = dice_P1>0 && dice_P1<=6;
                    if(is_valid_P1) break;
                    System.out.println("Invalid input, please try again");
                }while(!is_valid_P1);
                sum_P1 +=dice_P1;
            }
            System.out.println("Current Player 1 sum: "+ sum_P1);
            System.out.println();

            do{
                System.out.print("Player 2, Enter your throw here (1 to 6): ");
                dice_P2 = input.nextInt();
                is_valid_P2 = dice_P2>0 && dice_P2<=6;
                if(is_valid_P2) break;
                System.out.println("Invalid input, please try again");
            }while(!is_valid_P2);
            sum_P2 +=dice_P2;
            if(dice_P2 == 6){
                System.out.println("Player 2, you have chance to throw the dice again");
                do{
                    System.out.print("Player 2,Enter your throw here (1 to 6): ");
                    dice_P2 = input.nextInt();
                    is_valid_P2 = dice_P2>0 && dice_P2<=6;
                    if(is_valid_P2) break;
                    System.out.println("Invalid input, please try again");
                }while(!is_valid_P2);
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

        input.close();

    }
}
