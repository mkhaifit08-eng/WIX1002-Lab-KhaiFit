// Write a Java method that returns a triangular number. A triangular number is defined as 1+2+3+…+ n. 
// Then, write a Java program to use the method to display the first 20 triangular numbers.

package lab6;

public class L6Q1 {
    static int triangularNumbers(int n){
        int sum =0;
        for(int i=1; i<=n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println();

        System.out.println("The first 20 Triangular Numbers: ");
        System.out.println("=".repeat(30));
        System.out.printf("%3s || %17s %n", "n", "nth Triangular Number");
        System.out.println("=".repeat(30));
        for(int n=1; n<=20;n++){
            System.out.printf("%3d || %17d %n", n, triangularNumbers(n));
        }
        System.out.println("=".repeat(30));
    }
}
