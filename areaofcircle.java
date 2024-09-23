import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args){
        int radius;
        double pi=3.14159265;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        radius=sc.nextInt();
        double result=pi*radius*radius;
        System.out.print("radius of circle is:- "+ result);
        sc.close();
    }
}