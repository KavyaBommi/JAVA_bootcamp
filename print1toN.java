package loops;
import java.util.Scanner;
public class print1toN {
    public static void main(String[] args) {
        Scanner sequence=new Scanner(System.in);
        System.out.println("enter the nth number");
        int until=sequence.nextInt();
        int i=1;
        while(i<=until){
            System.out.print(i);
            i++;
            System.out.print(" ");
        }
        sequence.close();
    }
}
