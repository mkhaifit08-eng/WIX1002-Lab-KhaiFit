/*
    Write a program that calculates the energy needed to heat water.  
    Q = M * (final temperature – initial temperature) * 4184 
    M = Weight of water in kg 
    Q = Energy in joules 
    The temperature are in degree Celsius
*/
package lab2;

import java.util.Scanner;
public class L2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram : ");
        double M  = input.nextDouble();
        M = M / 1000;
         System.out.print("Enter the initial temperature in Farenheit: ");
        double T0 = input.nextDouble();
        System.out.print("Enter the final temperature in Farenheit: ");
        double T1 = input.nextDouble();
        T0 = (T0 - 32)*5.0/9.0;
        T1 = (T1 - 32)*5.0/9.0;
        double Q = M * (T1-T0) * 4184;
        System.out.printf("The energy needed is %e \n", Q);
    }
}
