/*
    Write a program that accepts an integer n from user and then sum the following
    series.
    1+(1+2)+(1+2+3)+(1+2+3+4)+....+(1+2+3+4+....+n)
*/
package lab4;
import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt(), sum=0;

        System.out.println();
        System.out.print("Sum = ");

        for(int i=1; i<=n; i++){
            if (i != 1) System.out.print("(");

            for(int j=1; j<=i; j++){
                System.out.print(j);
                sum += j;
                if(j<i){
                    System.out.print(" + ");
                }
            }
            
            if (i == 1) System.out.print(" + ");
            else if(i==n) System.out.print(") = ");
            else System.out.print(") + ");
        }

        System.out.println(sum);
        System.out.println("Final Answer: " + sum);
        input.close();
    }
}
