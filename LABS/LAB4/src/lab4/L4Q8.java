/*
    8. Write a program that generates the first n prime number. n is an random integer
    within 0 to 100.
 */

package lab4;

import java.util.Random;
public class L4Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        System.out.println("The first "+ n + " prime number: ");
        boolean is_prime_number = true;
        int candidate =2, i=0;

        while(i<=n){
            is_prime_number = true;
            double limit = Math.sqrt(candidate);
            for(int j=2; j<=limit; j++){
                if(candidate % j == 0){
                    is_prime_number = false;
                    break;
                }
            }
            if(is_prime_number){
                System.out.print(candidate);
                if(i < n){
                    System.out.print(",\t");
                }
                i++;
            }
            
            candidate++;

        }


    }
}
