/*
    Write a program that asks users to enter the radius of a circle and a coordinate point
    (x, y). Determine whether the point is inside or outside the circle centered at (0, 0).
 */

import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        double radius, x, y;
        System.out.println("Enter the value x and y of coordinate (x,y), seperated by a space");
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.println();

        System.out.print("We are building a circle with radius r cm, Enter the value of r: ");
        radius = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        double epsilon = 1e-9;
        if((Math.abs(distance - radius))<epsilon){
            System.out.printf("The point (%f, %f) is on the circle",x,y);
        } else if(distance < radius){
            System.out.printf("The point (%f, %f) is inside the circle",x,y);
        }else{
            System.out.printf("The point (%f, %f) is outside the circle",x,y);
        }

        input.close();
    }
}
