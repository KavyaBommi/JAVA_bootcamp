import java.util.Scanner;
public class product {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        num1=sc.nextInt();
        System.out.println("enter 2nd number");
        num2=sc.nextInt();
        int pro=num1*num2;
        System.out.print("product of two numbers is:- "+ pro);
        sc.close();
    }
}

