// 5. Write a Java method that accepts three parameters,  the method will compare whether the third parameter 
// value is equal to the multiplication of parameter 1 and parameter 2. 
// Then, write a Java multiplication game for any random number within 0 – 12.

package lab6;
import java.util.Scanner;
import java.util.Random;

public class L6Q5 {
    static boolean isProductOf(int num1, int num2, int num3){
        if(num1 * num2 == num3) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int score=0, num1, num2, answer;
        do{
            num1 = rand.nextInt(13);
            num2 = rand.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.printf("%d x %d = ", num1, num2);
            answer = input.nextInt();
            if(isProductOf(num1, num2, answer)) score++;
        }while(answer >= 0);
        System.out.println("Your score is " + score);

        input.close();
    }
}
