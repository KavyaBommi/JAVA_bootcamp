import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner swec=new Scanner(System.in);
        System.out.println("enter the number");
        int number=swec.nextInt();
        if(number%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
        swec.close();
    }
}