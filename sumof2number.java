import java.util.Scanner;
public class sumof2number{
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        num1=sc.nextInt();
        System.out.println("enter 2nd number");
        num2=sc.nextInt();
        int sum=num1+num2;
        System.out.print("sum of two numbers is:- "+ sum);
        sc.close();
    }
}