// 4. Write a Java method that implements Euclidean Algorithm 
// to return the greatest common divisor of two positive integers. 
// Then, write a program to get the GCD for (24, 8) and (200, 625).

package lab6;

public class L6Q4 {
    static int euclideanGCD(int num1, int num2){
        int prod, div, rem;
        prod = num1; div = num2; 
        
        while(true){
            rem = prod % div;
            if(rem == 0) return div;
            prod = div;
            div = rem;
        }
        
        
    }

    public static void main(String[] args) {
        System.out.println("Greatest Command Divisor for  24,   8: " + euclideanGCD(24,8));
        System.out.println("Greatest Command Divisor for 200, 625: " + euclideanGCD(200, 625));
    }
}
