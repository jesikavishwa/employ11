package functionoverloading;
import java.util.Scanner;
public class Functionoverloading
{
    public void area(int l,int b)//same function but int value as argument
    {
        int a=l*b;
        System.out.println("Area of rectangle is "+a+" sq.m");
    }
    public void area(double l,double b)//double arguments
    {
        double a=l*b;
        System.out.println("Area of rectangle is "+a+" sq.m");
    }
    public static void main(String[] args) {
        Functionoverloading f=new Functionoverloading();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length and breadth in int values");
        int l1=in.nextInt();
        int b1=in.nextInt();
        f.area(l1,b1);
        System.out.println("Enter length and breadth in double values");
        double l2=in.nextDouble();
        double b2=in.nextDouble();
        f.area(l2, b2);
    }
}
