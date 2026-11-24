// 6. Write a Java method that determine whether a number is a palindromic prime and another method that determine whether a number is emirp (the number is a prime number and the reverse also a prime number and is not palindromic prime). 
// Then, write a Java program to use the methods to display the first 20 palindromic prime and emirp.

package lab6;

public class L6Q6 {
    static boolean isPalindromicPrime(int num) {
        if (num <= 1) return false;

        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        if (original != reversed) return false;

        for (int i = 2; i * i <= original; i++) {
            if (original % i == 0) return false;
        }

        return true;
    }

    static boolean isEmirp(int num, boolean palindromicStatus){
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        if (palindromicStatus) return false;
        else{
           int reversed = 0;
           while (num > 0) {
                reversed = reversed * 10 + (num % 10);
                num /= 10;
            }
            for (int i = 2; i * i <= reversed; i++) {
                if (reversed % i == 0) return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        int[] palindromic_primes = new int[20];
        int[] emirps = new int[20];
        int i = 0; // counter for palindromic
        int j = 0; // counter for emirps
        int num = 2;

        while(i < 20 || j < 20){
            boolean palindromic_status = isPalindromicPrime(num);
            boolean emirp_status = isEmirp(num,palindromic_status);
            if(palindromic_status && i<20){
                palindromic_primes[i] = num;
                i++;
            }
            if(emirp_status && j<20){
                emirps[j] = num;
                j++;
            }
            num++;

        }

        System.out.println("The first 20 palindromic primes: ");
        for(i=0; i<palindromic_primes.length; i++){
            System.out.print(palindromic_primes[i]);
            if(i<palindromic_primes.length - 1) System.out.print(", ");
        }
        System.out.println();

        System.out.println("The first 20 emirp primes: ");
        for(j=0; j<emirps.length; j++){
            System.out.print(emirps[j]);
            if(j<emirps.length - 1) System.out.print(", ");
        }
        System.out.println();
        
    }
    
}
