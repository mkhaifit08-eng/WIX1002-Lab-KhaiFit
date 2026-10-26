import java.util.Scanner;
public class T2Q6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double d,s;
        System.out.print("Enter diameter: ");
        d = input.nextFloat();
        s = Math.PI*d;
        System.out.printf("%s %.3f \n","The circumference of the circle is: ",
                s);

        input.close();
    }
}
