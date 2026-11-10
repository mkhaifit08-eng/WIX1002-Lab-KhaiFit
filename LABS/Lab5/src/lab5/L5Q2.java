/* 
    Write a program that generates 10 non-duplicate random integers within the range
    from 0 to 20.
*/

package lab5;

import java.util.Random;
public class L5Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randInt = new int[10];
        int i=0;

        looper:
        while(i<randInt.length){
            int temp = rand.nextInt(21);
            for(int j=0;j<i;j++){
                if(randInt[j]==temp) continue looper;
            }
            randInt[i] = temp;
            i++;
        }

        System.out.print("Generated Numbers: ");
        for(i=0;i<randInt.length;i++){
            System.out.print(randInt[i]);
            if(i < randInt.length -1 ){
                System.out.print(",");
            }
        }
        System.out.println();

    }
}
