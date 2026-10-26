/*
    Write the java statements that determine whether the Leap year. A Leap year is 
    divisible by 4 but not by 100. However, a Leap year is also divisible by 400. 

*/

import java.util.Scanner;
public class T3Q5 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeapYear;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year% 400 == 0){
                    isLeapYear = true;
                }else{
                    isLeapYear = false;
                }
            }else{
                isLeapYear = true;
            }
        }else{
            isLeapYear = false;
        }

        if(isLeapYear){
            System.out.printf("%d is a Leap Year", year);
        }else{
            System.out.printf("%d is not a Leap Year", year);
        }

        input.close();
    }   
}
