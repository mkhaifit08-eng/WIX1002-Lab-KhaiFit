/*
    Write a program that rotates 90 degrees clockwise a 3 by 3 matrix.
*/

package lab5;

public class L5Q4 {
    public static void main(String[] args) {
        int[][] Mat= {{1,5,7},{3,6,9},{5,3,8}};
        int[][] MatRotated = new int[Mat[0].length][Mat.length];
        int i, j;

        System.out.println("3 by 3 Matrix: ");
        for(i=0;i<Mat.length;i++){
            for(j=0; j<Mat[i].length;j++){
                System.out.print(Mat[i][j]);
                if(j<Mat[i].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("After rotated 90 degree clockwise:");
        for(i=0;i<Mat.length;i++){
            for(j=0;j<Mat[i].length;j++){
                MatRotated[i][j]= Mat[Mat[i].length-j-1][i];
            }
        }

        for(i=0;i<MatRotated.length;i++){
            for(j=0; j<MatRotated[i].length;j++){
                System.out.print(MatRotated[i][j]);
                if(j<MatRotated[i].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
