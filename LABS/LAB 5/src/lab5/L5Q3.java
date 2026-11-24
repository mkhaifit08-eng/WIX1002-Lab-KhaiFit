/* 
    Write a program that randomly generate the seven day work hours (1-8 hours) for N
    employee. Then, display the work hours in seven days and the total hours for each
    employee
*/

package lab5;
import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employers: ");
        int N = input.nextInt();
        
        int[][] working_hours = new int[N][7];
        for(int i=0; i<working_hours.length; i++){
            for(int j=0; j<working_hours[i].length; j++){
                working_hours[i][j] = rand.nextInt(8)+1;
            }
        }

        for(int i=0; i<working_hours.length; i++){
            int sum_working_hour=0;
            System.out.printf("%-15s: %n","Employee "+ (i+1));
            System.out.printf("%-15s: %-5s %-5s %-5s %-5s %-5s %-5s %-5s%n", "Day", "Day 1","Day 2","Day 3","Day 4","Day 5","Day 6","Day 7");
            System.out.printf("%-15s: ", "Working Hours");
            for(int j=0; j<working_hours[i].length; j++){
            System.out.printf(" %-3d  ",working_hours[i][j]);
            sum_working_hour += working_hours[i][j];
            }
            System.out.println();
            System.out.printf("%-15s: %d%n", "Total Hours", sum_working_hour);
            System.out.println();
        }


        input.close();
    }
}
