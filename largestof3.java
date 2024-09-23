import java.util.Scanner;
public class largestof3 {
    public static void main(String[] args) {
        Scanner numbers=new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=numbers.nextInt();
        System.out.println("enter 2nd number");
        int num2=numbers.nextInt();
        System.out.println("enter 3rd number");
        int num3=numbers.nextInt();
        if (num1>=num2 && num1>=num3){
            System.out.println("Largest number among three numbers is: " + num1);
        }
        else if (num2>=num3 && num2>=num1){
            System.out.println("Largest number among three numbers is: " + num2);
        }
        else{
            System.out.println("Largest number among three numbers is: " + num3);
        }
        numbers.close();
    }
    
}
