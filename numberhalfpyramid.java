package patterns;
import java.util.Scanner;
public class numberhalfpyramid {
    public static void main(String[] args) {
        /*    1
              1 2 
              1 2 3 
              1 2 3 4 
              1 2 3 4 5      */
         Scanner number=new Scanner(System.in);
         System.out.print("enter number of rows");
         int num=number.nextInt();
         for(int i=1;i<=num;i++){
             int nums=i;
            for(int j=1;j<=nums;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
         }
     number.close();
    }
}
