package patterns;
import java.util.Scanner;
public class halfpyramid {
    public static void main(String[] args) {
        /*    *
              * * 
              * * * 
              * * * * 
              * * * * *      */
         Scanner number=new Scanner(System.in);
         System.out.print("enter number of rows");
         int num=number.nextInt();
         for(int i=1;i<=num;i++){
             int stars=i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
         }
     number.close();
    }
}
