/*
    Write a program that convert the temperature in degree Fahrenheit 
    to degree Celsius. The program will display the degree Celsius in two 
    decimal places. Celsius = (Fahrenheit – 32) / 1.8 
*/

package lab2;

import java.util.Scanner;
public class L2Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dF, dC;
        System.out.print("Enter temperature in degree Fahrenheit: ");
        dF= input.nextDouble();
        dC= (dF-32)/1.8;
        System.out.printf("%-40s : %.2f \n", "Temperature in Degree Celcius", dC);
        input.close();
    }
}