/*
    Write a program that calculates the minimum, maximum, average and standard
    deviation (s) of the exam score in a subject. The program will accepts the score and
    quit if negative score is enter. A sample output is given below.
*/

package lab4;
import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] Args){
            Scanner input = new Scanner(System.in);
            int min=0, max=0, sum=0, sumsq=0,score;
            int n=0;
            double average, std_dev;

            do{
                System.out.print("Enter a score [negative score to quit]: ");
                score = input.nextInt();
                if(score < 0) break;
                n++;
                sum += score;
                sumsq += (score*score);
                if(score < min) min = score;
                if(score > max) max = score;
            } while(score > 0);

            average = (double)sum/n;
            std_dev = Math.sqrt((sumsq-(sum*sum/n))/(n-1));

            System.out.printf("%-20s: %d%n","Minimum Score", min);
            System.out.printf("%-20s: %d%n","Maximum Score", max);
            System.out.printf("%-20s: %.2f%n","Average Score", average);
            System.out.printf("%-20s: %.2f%n","Standard Deviation", std_dev);

            input.close();
    }

}
