/*
    Write a program that ask user to enter the year and the first day of the year (0 for
    Sunday, 1 for Monday, … , 6 for Saturday). Display the calendar for May and
    August.
 */


package lab4;
import java.util.Scanner;


public class L4Q4Alt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Get the input from users Input
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.println();
        System.out.println("Enter the first day of the year");
        System.out.println("0 for Sunday");
        System.out.println("1 for Monday");
        System.out.println("2 for Tuesday");
        System.out.println("3 for Wednesday");
        System.out.println("4 for Thursday");
        System.out.println("5 for Friday");
        System.out.println("6 for Saturday");
        System.out.print("Enter your response here: ");
        int firstDayOfYear = sc.nextInt();

        // 2. Perform required calculation Processing
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int dayUntilMay = 31 + (isLeapYear ? 29 : 28) + 31 + 30;
        int dayUntilAug = dayUntilMay + 31 + 30 + 31;
        int dayUntilNov = dayUntilAug + 31 + 30 + 31;
        int firstDayOfMay = (firstDayOfYear + dayUntilMay) % 7;
        int firstDayOfAug = (firstDayOfYear + dayUntilAug) % 7;
        int firstDayOfNov = (firstDayOfYear + dayUntilNov -1) % 7;

        String columnFormat = "%4s";
        String format = "%4s%4s%4s%4s%4s%4s%4s%n"; // string formatting - different types of string formatting

        // 3. Print the calendar of May Output
        System.out.println("May "+ year);
        System.out.printf(format, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for (int i = 0; i < firstDayOfMay; i++) {
            System.out.printf(columnFormat, "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf(columnFormat, i);
            if ((i + firstDayOfMay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();

        // 4. Print the calendar of August
        System.out.println("August "+ year);
        System.out.printf(format, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for (int i = 0; i < firstDayOfAug; i++) {
            System.out.printf(columnFormat, "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf(columnFormat, i);
            if ((i + firstDayOfAug) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();

        // 4. Print the calendar of November
        System.out.println("\tNovember "+ year +"\t");
        System.out.printf(format, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        for (int i = 0; i < firstDayOfNov; i++) {
            System.out.printf(columnFormat, "");
        }
        for (int i = 1; i <= 30; i++) {
            System.out.printf(columnFormat, i);
            if ((i + firstDayOfNov) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
        
    }
}