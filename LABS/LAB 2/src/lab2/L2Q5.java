/*
    Write a program that generates one random number.  The range of 
    the random number is 0 to 10000. Display the number and the sum 
    of all the digits in the number.
 */
package lab2;

import java.util.Random;
public class L2Q5{
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_num = rand.nextInt(10001);
        int sum = 0, rem;
        System.out.println("The random number is: " + rand_num);

        while(rand_num > 0){
            rem = rand_num % 10;
            sum += rem;
            rand_num /= 10;
        }
        
        System.out.println("The sum of all the digits in the number is: " + sum);
    }
    
}