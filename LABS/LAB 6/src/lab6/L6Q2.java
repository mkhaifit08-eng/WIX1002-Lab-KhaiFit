// Write a Java method multiPrint(int n, char c) that prints n copies of character c. 
// Then,write a Java program to use the method to display the triangles and diamonds.


package lab6;

public class L6Q2 {
    static void multiPrint(int n, char c) {
        for (int i = 1; i <= n; i++)
            System.out.print(c);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Triangle 1:");
        for (int i = 1; i <= n; i++) {
            multiPrint(i, '*');
            System.out.println();
        }

        System.out.println();

        System.out.println("Triangle 2:");
        for (int i = 1; i <= n; i++) {
            multiPrint(n - i, ' ');
            multiPrint(i, '*');
            System.out.println();
        }

        System.out.println();

        System.out.println("Triangle 3:");
        for (int i = 1; i <= n; i++) {
            multiPrint(n - i + 1, '*');
            System.out.println();
        }

        System.out.println();

        System.out.println("Triangle 4:");
        for (int i = 1; i <= n; i++) {
            multiPrint(i - 1, ' ');
            multiPrint(n - i + 1, '*');
            System.out.println();
        }

        System.out.println();

        System.out.println("Triangle 5:");
        for (int i = 1; i <= n; i++) {
            multiPrint(n-i, ' ');
            multiPrint(2*i-1, '*');
            multiPrint(n-i, ' ');
            System.out.println();
        }

        System.out.println();

        System.out.println("Diamond:");
        for (int i = 1; i <= n; i++) {
            multiPrint(n - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            multiPrint(i, ' ');
            multiPrint(2 * (n - 1) - 2 * i + 1, '*');
            System.out.println();
        }
    }
}
