/*
    Write a program that calculates the total commission receives based on the table below. The program 
    will accept the sales volume and calculate the commission. Display the commission in two decimal places.
    Sales Volume                                     |   Commission
    Less than or equal to 100                        | 5% of total sales
    Greater than 100 and less than or equal to 500   | 7.5% of total sales
    Greater than 500 and less than or equal to 1000  | 10% of total sales
    Greater than 1000                                | 12.5% of total sales

*/
import java.util.Scanner;
public class L3Q3 {
    public static void main (String[] Args){
        Scanner input = new Scanner(System.in); 
        double rate, sales, commision;
        System.out.print("Enter the total of sales: ");
        sales = input.nextDouble();
        if(sales>1000){
            rate = 0.125;
        }else if (sales >500){
            rate = 0.10;
        }else if(sales>100){
            rate = 0.75;
        }else{
            rate = 0.05;
        }
        commision = rate*sales;
        System.out.printf("The commission = RM%.2f",commision);

        input.close();

    }

}
