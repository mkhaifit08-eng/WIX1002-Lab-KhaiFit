/*
    Cramer’s rule is used to solve the linear equations.
        ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
    Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x
    and y. If ad – bc is equal to 0. Display "The equation has no solution"
*/
import java.util.Scanner;
public class L3Q5 {
  public static void main(String[] Args){
    Scanner input = new Scanner(System.in);
    double x,y;
    System.out.println("ax + by = e, enter the value of a, b and e: ");
    System.out.print("a = ");
    double a = input.nextDouble();
    System.out.print("b = ");
    double b = input.nextDouble();
    System.out.print("e = ");
    double e = input.nextDouble();
    System.out.println();

    System.out.println("cx + dy = f, enter the value of a, b and e: ");
    System.out.print("c = ");
    double c = input.nextDouble();
    System.out.print("d = ");
    double d = input.nextDouble();
    System.out.print("f = ");
    double f = input.nextDouble();
    System.out.println();    

    if((a*d - b*c) ==0){
        System.out.println("These equations has no solution");
    }else{
        x = (e*d-b*f)/(a*d-b*c);
        y = (a*f-e*c)/(a*d-b*c);
        System.out.printf("x = %f %n",x);
        System.out.printf("y = %f %n",y);

    }

   input.close();
    
  }  
}
