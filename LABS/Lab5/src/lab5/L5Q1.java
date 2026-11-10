/* 
    Write a program to randomly generate N student scores (0-100). The program will
    prompt the user to enter N students and store the score in an array. Then, the program
    will display a list of score, the highest score, the lowest score and the average score
*/

package lab5;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {
        Random rand  = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int N = input.nextInt();

        int[] scores = new int[N];

        int i;
        for(i=0; i<scores.length; i++){
            scores[i] = rand.nextInt(101);
        }

        int highest=0, lowest=100, sum=0; double average;

        System.out.printf("%-20s: %d %n", "Number of Students", N);
        System.out.printf("%-20s: ", "Scores");
        for(i=0; i<scores.length;i++){
            System.out.print(scores[i]);
            if(i<scores.length-1) System.out.print(",");
            sum += scores[i];

            if(lowest>scores[i]) lowest=scores[i];
            if(highest<scores[i]) highest=scores[i];
        }
        average = (double)sum/N;
        System.out.println();
        System.out.printf("%-20s: %d %n", "The Highest Score", highest);
        System.out.printf("%-20s: %d %n", "The Lowest Score", lowest);
        System.out.printf("%-20s: %f %n", "The Average Score", average);

        input.close();
    }    
}
