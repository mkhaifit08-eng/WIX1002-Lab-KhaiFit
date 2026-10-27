import java.util.Scanner;

public class T3Q1c {
    public static void Main(String[] Args){
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        System.out.print("");
        if (ch >= 'A' && ch <= 'Z') {
        System.out.println(ch + " is a capital letter."); 
        } else { 
        System.out.println(ch + " is NOT a capital letter."); 
        }
        input.close();
    }
}
