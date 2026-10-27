import java.util.Scanner;

public class T3Q1d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();

        if (string1.compareToIgnoreCase(string2) <= 0) {
            System.out.println(string1);
            System.out.println(string2);
        } else {
            System.out.println(string2);
            System.out.println(string1);
        }

        input.close();
    }
}
