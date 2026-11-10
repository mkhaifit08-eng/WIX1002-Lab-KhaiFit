/*
    Write a program that used to create Pascal Triangle in the square matrix. The program
    will accept an integer from the users and use the integer to create the Pascal Triangle.
*/

package lab5;
import java.util.Scanner;

public class L5Q6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to Generate: ");
        int row = input.nextInt();
        int[][] mat = new int[row][row];

        for(int i=0;i<mat.length;i++){
            for(int j=0; j<=i;j++){
                if(j==0||j==i){
                    mat[i][j]=1;
                }else{
                    mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
                }
            }
        }

        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat[i].length;j++){
                System.out.printf("%-3d", mat[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}