package patterns;
import java.util.Scanner;
public class starsquare {
    public static void main(String[] args) {
        /*        * * * * *
                  * * * * *
                  * * * * *
                  * * * * *   
                  * * * * *      */
        Scanner number=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows=number.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        number.close();
    }
}
