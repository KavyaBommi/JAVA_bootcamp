package patterns;
import java.util.Scanner;
public class characterpattern {
    public static void main(String[] args) {
        /*    A
              A B 
              A B C 
              A B C D 
              A B C D E      */
         Scanner number=new Scanner(System.in);
         System.out.print("enter number of rows");
         int num=number.nextInt();
         for(int i=1;i<=num;i++){
             int chars=i;
            for(int j=1;j<=chars;j++){
                System.out.print( (char)(j+64)+ " ");
            }
            System.out.println();
         }
     number.close();
    }
}