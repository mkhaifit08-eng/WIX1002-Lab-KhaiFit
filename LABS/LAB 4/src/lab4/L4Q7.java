/*
    Write a program that used to calculate mortgage loan. The program will create the
    amortization table with equal total payment plan. The following are the formula and
    the sample output.
*/

package lab4;

import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        double P = input.nextDouble();
        System.out.print("Enter Interest in %: ");
        double i = input.nextDouble();
        System.out.print("Enter totalnumber of month(s): ");
        int N = input.nextInt();

        double M, C, L, R, total_interest=0;
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%n", "Month", "Monthly Payment", "Principal","Interest","Unpaid Balance","Total Interest");
        M=(P*i/(12*100)/(1-Math.pow(1+i/(12*100),-N)));

        for(int n=1; n<=N; n++){
            C=M*Math.pow(1+i/(12*100),-(1+N-n));
            L=M-C;
            total_interest += L;
            R=L/(i/(12*100))-C;
            System.out.printf("%-20d%-20.2f%-20.2f%-20.2f%-20.2f%-20.2f%n", n, M, C,L,R,total_interest);
        }

        input.close();
    }

    
}
