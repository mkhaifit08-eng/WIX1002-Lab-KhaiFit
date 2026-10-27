/*
    Write a simple two players dice game. Each player will roll the dice twice and the
    player with the highest score wins the game.
 */
import java.util.Random;

public class L3Q4 {
    public static void main(String[] Args){
        Random rand = new Random();
        int Play1Dice1 = rand.nextInt(6)+1;
        int Play1Dice2 = rand.nextInt(6)+1;
        int Play1Score = Play1Dice1 + Play1Dice2;

        int Play2Dice1 = rand.nextInt(6)+1;
        int Play2Dice2 = rand.nextInt(6)+1;
        int Play2Score = Play2Dice1 + Play2Dice2;

        System.out.println("Player 1: ");
        System.out.printf("Dice 1: %d %n",Play1Dice1);
        System.out.printf("Dice 2: %d %n",Play1Dice2);
        System.out.printf("Total: %d %n",Play1Score);
        System.out.println();

        System.out.println("Player 2: ");
        System.out.printf("Dice 1: %d %n",Play2Dice1);
        System.out.printf("Dice 2: %d %n",Play2Dice2);
        System.out.printf("Total: %d %n",Play2Score);
        System.out.println();

        if(Play1Score>Play2Score){
            System.out.println("Player 1 is the winner");
        }else if (Play2Score>Play1Score){
            System.out.println("Player 2 is the winner");
        }else{
            System.out.println("Player 1 and Player 2 tied");
        }
    }
}
