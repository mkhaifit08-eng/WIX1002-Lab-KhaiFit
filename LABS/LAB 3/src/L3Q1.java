/*
    Write a program that stimulates a simple calculator. It reads two integers and a
    character. If the character is a +, the sum is printed; if it is a -, the difference is
    printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if
    it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)
 */
import java.util.Scanner;
public class L3Q1{
    public static void main (String[] Args){
        Scanner input = new Scanner(System.in);
        boolean isValid=true;
        int num1, num2, result=0; char op;
        System.out.print("Enter two integer numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.print("Enter the operand: ");
        op = input.next().charAt(0);
        

        System.out.println();

        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%': 
                result = num1  % num2;
                break;
            default:
                System.out.print("Invalid output");
                isValid = false;
        }
        

        if(isValid){
            System.out.printf("%d %c %d = %d %n", num1, op, num2, result);
        }
        input.close();   
    }
 
}


