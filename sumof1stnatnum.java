package loops;
import java.util.Scanner;
public class sumof1stnatnum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=1;
        System.out.println("enter the nth number");
        int until=input.nextInt();
        int sum=0;
        while(i<=until){
            sum+=i;
            i++;
        }
        System.out.println("sum of n natural numbers is: "+sum);
        input.close();
    }
}
