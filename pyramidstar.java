package patterns;
import java.util.Scanner;
public class pyramidstar {
    public static void main(String[] args) {
        /*       *
                * *
               * * * 
              * * * *
             * * * * *          */
        Scanner numberof=new Scanner(System.in);
        System.out.println("print number of rows");
        int rows=numberof.nextInt();
        for(int i=1;i<=rows;i++)
        {
            int spaces=rows-i;
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        numberof.close();
    }
}
