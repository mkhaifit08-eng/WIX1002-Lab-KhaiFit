import java.util.Scanner;

public class T3Q1b {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x= input.nextInt();

        if (x %2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        input.close();
    }
}
