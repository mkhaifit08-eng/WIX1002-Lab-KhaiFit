/*
    4.	Write the java statements that used the if statement to find the biggest number 
    among three given integers. 
*/

import java.util.Scanner;

public class T3Q4{
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer to be compared: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int biggestNum;

        if(num1>num2){
            if(num1>num3){
                biggestNum=num1;
            }else{
                biggestNum=num3;
            }
        }else{
            if(num2>num3){
                biggestNum=num2;
            }else{
                biggestNum=num3;
            }
        }

        System.out.println("The biggest number is " + biggestNum);
        input.close();
    }
}
