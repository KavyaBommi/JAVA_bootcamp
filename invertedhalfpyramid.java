package patterns;
import java.util.Scanner;
public class invertedhalfpyramid {
    public static void main(String[] args) {
        /*     * * * * * 
               * * * *
               * * *
               * *
               *         */
        Scanner numberof=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows=numberof.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();   
        }
        numberof.close();
    }
}
