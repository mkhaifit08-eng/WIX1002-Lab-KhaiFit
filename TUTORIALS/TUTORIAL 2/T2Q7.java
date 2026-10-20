import java.util.Scanner;

public class T2Q7{
    public static void main(String[] Args){
        Scanner input =  new Scanner(System.in);
        double inch, m;
        System.out.print("Enter value in Inch: ");
        inch= input.nextDouble();
        m = inch *2.54/100;
        System.out.printf("%.2f inches = %.2f meters \n", inch, m);
    }
            
}
