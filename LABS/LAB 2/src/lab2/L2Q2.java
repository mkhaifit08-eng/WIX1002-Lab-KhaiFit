/*
Write a program to calculate the monthly payment for car loan. 
The following are the inputs of the program. Output the monthly 
payment in two decimal places. 
P  The price of the car 
D   Down payment 
R  Interest Rate in % 
Y   Loan duration in year 
M   Monthly Payment 
M = (P – D) * (1 + R*Y/100) / (Y *12)
*/

package lab2;

import java.util.Scanner;
public class L2Q2 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double P, D, R, M; int Y;
        System.out.println("Enter the following: ");
        System.out.printf("%-50s :RM ","The price of the car");
        P = input.nextDouble();
        System.out.printf("%-50s :RM ","Down payment");
        D = input.nextDouble();
        System.out.printf("%-50s : ","Interest Rate in %");
        R = input.nextDouble();
        System.out.printf("%-50s : ","Loan duration in year");
        Y = input.nextInt();
        M = (P - D) * (1 + R*Y/100) / (Y *12);
        System.out.printf("%-50s : RM%.2f ","The Monthly Payment is", M);

        input.close();
    }
}
