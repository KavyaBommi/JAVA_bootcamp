import java.util.Scanner;
public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner salary=new Scanner(System.in);
        System.out.println("enter the salary");
        int amount=salary.nextInt();
        if(amount<=50000){
            System.out.println("not required to pay the tax"); 
        }
        else if(amount<=100000){
            System.out.println("tax to pay is: " + (amount*0.1));
        }
        else{
            System.out.println("tax to pay is: " + (amount*0.2));
        }
        salary.close();
    }
}

