/*
    Write a program that ask user to enter the year and the first day of the year (0 for
    Sunday, 1 for Monday, … , 6 for Saturday). Display the calendar for May and
    August.
 */


package lab4;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year, first_day_year;
        int current_day, days;
        int mayFirstDay, augustFirstDay;

        // INPUT
        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.println("Enter the first day of the year");
        System.out.println("0 for Sunday");
        System.out.println("1 for Monday");
        System.out.println("2 for Tuesday");
        System.out.println("3 for Wednesday");
        System.out.println("4 for Thursday");
        System.out.println("5 for Friday");
        System.out.println("6 for Saturday");
        System.out.print("Enter your response here: ");
        first_day_year = input.nextInt();

        // DETERMINE LEAP YEAR
        boolean leapYear = (year % 400 == 0) ||
                           (year % 4 == 0 && year % 100 != 0);

        // STORE THE NUMBER OF DAYS IN EACH MONTH
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (leapYear) {
            daysInMonth[1] = 29;
        }

        // CALCULATE FIRST DAY OF MAY
        current_day = first_day_year;

        for (int month = 0; month < 4; month++) {
            current_day = (current_day + daysInMonth[month]) % 7;
        }

        mayFirstDay = current_day;

        // CALCULATE FIRST DAY OF AUGUST
        for (int month = 4; month < 7; month++) {
            current_day = (current_day + daysInMonth[month]) % 7;
        }

        augustFirstDay = current_day;

        // DISPLAY MAY CALENDAR
        System.out.println("\n\t\tMay " + year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        for (int i = 0; i < mayFirstDay; i++) {
            System.out.print("\t");
        }

        for (int day = 1; day <= daysInMonth[4]; day++) {
            System.out.printf("%d\t", day);

            if ((day + mayFirstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n");

        // DISPLAY AUGUST CALENDAR
        System.out.println("\t\tAugust " + year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        for (int i = 0; i < augustFirstDay; i++) {
            System.out.print("\t");
        }

        for (int day = 1; day <= daysInMonth[7]; day++) {
            System.out.printf("%d\t", day);

            if ((day + augustFirstDay) % 7 == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}
