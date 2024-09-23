package patterns;
import java.util.Scanner;
public class invertedstar {
    public static void main(String[] args) {
        /*            * * * * *
                        * * * *
                          * * *
                            * *
                              *            */
        Scanner number=new Scanner(System.in);
        System.out.print("enter number of rows");
        int num1=number.nextInt();
        for(int i=1;i<=num1;i++){
            int spaces=i-1;
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=num1-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        number.close();
        }
    }
