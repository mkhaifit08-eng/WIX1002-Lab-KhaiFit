/*
    Write a program that converts the seconds to hours, minutes 
    and seconds.
*/
package lab2;

import java.util.Scanner;

public class L2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int second, ansH, ansM, ansS;
        System.out.print("Enter the number of seconds : ");
        second = input.nextInt();
        ansH = second/(60*60);
        ansM = (second % 3600) / 60;
        ansS = second % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", second, ansH,ansM, ansS);

        input.close();
    }
}
