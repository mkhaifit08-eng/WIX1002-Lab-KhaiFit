/*
    Write a program that generates 20 random integers within the range from 0 to 100.
    Sort the array in descending order. Then, accepts an integer input from the user. Then,
    search the array using this number. Compare the performance of linear search and
    binary search
*/

package lab5;
import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20]; int i, bin_search=0, linear_search=0;

        System.out.println("A list of 20 random integer within 0 to 100");
        for(i=0; i<arr.length;i++){
            arr[i] = rand.nextInt(101);
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(", ");
        }
        System.out.println();

        for(i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Array in discending order: ");
        for(i=0; i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(", ");
        }
        System.out.println();

        System.out.print("Enter a number to search: ");
        int to_be_found = input.nextInt();
        boolean value_found=false;

        for(i=0;i<arr.length;i++){
            linear_search++;
            if(arr[i]==to_be_found){
                value_found=true;
                System.out.println(to_be_found + " found");
                break;
            }
        }
        if(!value_found) System.out.println(to_be_found + " not found");
        System.out.println("Linear Search = " + linear_search +" loop(s)");

        int low = 0, high = arr.length;
        value_found = false;

        while (low < high) {
            int mid = (low + high) / 2;

            bin_search++;

            if (arr[mid] == to_be_found) {
                value_found = true;
                System.out.println(to_be_found + " found");
                break;
            } else if (to_be_found > arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        if (!value_found) {
            System.out.println(to_be_found + " not found");
        }

        System.out.println("Binary Search = " + bin_search + " loop(s)");



        input.close();
    }
}
