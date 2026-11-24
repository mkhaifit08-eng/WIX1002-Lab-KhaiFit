// 3. Write a Java method that accepts an array of 10 integers. 
// The method should reverse the integer in the array. 
// Example, if the number is 1234, the number will change to 4321. 

package lab6;
import java.util.Arrays;
import java.util.Random;
public class L6Q3 {
    public static void main(String[] args){
        Random rand = new Random(1001);
        int [] nums = new int[10];
        for(int i=0; i<nums.length;i++){
            nums[i] = rand.nextInt((int)Math.pow(10,4));
        }
        System.out.println("Original Array: " + Arrays.toString(nums));
        reverseDigitinArray(nums);
        System.out.println("Reversed Array: " + Arrays.toString(nums));
    }

    static void reverseDigitinArray(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            int num = arr[i], reversed = 0;
            while(num>0){
                reversed = reversed * 10 + (num % 10);
                num /= 10;
            }
            arr[i] = reversed;
        }
    }
}
