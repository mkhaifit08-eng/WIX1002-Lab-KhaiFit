/*
    6. Write a program that generates a non-negative random integer. Display the number of
    digits in the integer.
 */

package lab4;

import java.util.Random;
public class L4Q6{
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(Integer.MAX_VALUE);
        System.out.println("Generated Number: "+ num);
        int digit_no=0;

        if(num ==0){
            digit_no =1;
        }else{
            while(num>0){
                digit_no++;
                num = num /10;
            }
        }
        
        System.out.println("Number of digit: "+ digit_no);

    }
}