import java.util.Scanner;

public class L3task{
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int [][] points =  new int[3][2];

        for(int i=0; i< points.length; i++){
            System.out.print("Enter coordinate of point" + i + " (seperated by space instead of comma): ");
            for(int j=0; j<points[i].length; j++){
                points[i][j] = input.nextInt();
            }
        }

        System.out.print("points = [");

        for(int i=0; i< points.length; i++){
            System.out.print("[");
            for(int j=0; j<points[i].length; j++){
                System.out.print(points[i][j]);
                if(j==0){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if(i<points.length -1)  System.out.print(",");

        }
        System.out.println("]");

        /*notes: The checking of straight line is done by gradient check:
            m=(y2-y1)/(x2-x1) = (y3-y1)/(x3-x1) = (y3-y2)/(x3-x2)
            notes: we take only the first 2 eqns
            to avoid div-by-0 issues, multiply both sides by (x2-x1)(x3-x1)
            (y2-y1)(x3-x1) = (y3-y1)(x2-x1)
            notes: please don't forget that first point means the pair of 
            (points[0][0], points[0][1]) in our programmes
        */


        boolean isBoomerang =  ((points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]));

        System.out.print("\n Is the points are boomerang? " + isBoomerang);

        input.close();
    }
}