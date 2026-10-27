/*
    Generate a random integer within 0 to 5 and display the integer in word.
 */

import java.util.Random;

public class L3Q2 {
    public static void main (String[] Args){
        Random rand = new Random();
        int inDigit = rand.nextInt(6);
        String inWord;

        switch(inDigit){
            case 0:
                inWord = "zero";
                break;
            case 1:
                inWord = "one";
                break;
            case 2:
                inWord = "two";
                break;
            case 3:
                inWord = "three";
                break;
            case 4:
                inWord = "four";
                break;
            case 5:
                inWord = "five";
                break;
            
            default:
                inWord = "not in range";
            }

            System.out.printf("%d is %s",inDigit,inWord);

        
    }
}
