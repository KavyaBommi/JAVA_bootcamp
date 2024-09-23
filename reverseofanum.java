package loops;
import java.util.Scanner;
public class reverseofanum {
    public static void main(String[] args) {
        Scanner rev=new Scanner(System.in);
        System.out.println("enter the number");
        int orgnum=rev.nextInt();
        int revnum=0;
        while(orgnum!=0){
              int digit =orgnum%10;
              revnum=revnum*10+digit;
              orgnum=orgnum/10;
        }
        System.out.println("reversed number is: "+ revnum);
        rev.close();
    }
}
