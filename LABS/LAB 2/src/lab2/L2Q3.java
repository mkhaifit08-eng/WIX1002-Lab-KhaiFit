/*
3. Write a program that generates three random numbers.  The range of the random 
number is 10 to 50. Display the three numbers, sum of the numbers and the average in 
two decimal places.
*/

package lab2;

import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
        Random rand= new Random();
        int num1 = rand.nextInt(40) + 10;
        int num2 = rand.nextInt(40) + 10;
        int num3 = rand.nextInt(40) + 10;
        System.out.println("The three numbers is: ");
        System.out.printf("%5d, %5d, %5d \n",num1, num2, num3);
        System.out.printf("%-10s : %d \n", "Sum", num1 + num2);
        System.out.printf("%-10s : %.2f \n", "Average", (num1+num2+num3)/3.0);
    }
}
