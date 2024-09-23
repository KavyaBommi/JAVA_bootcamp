import java.util.Scanner;
public class largestof2nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.print("largest number is num1: " + num1);
        }
        else{
            System.out.print("largest number is num2: " + num2);
        }
        sc.close();
    }
}
