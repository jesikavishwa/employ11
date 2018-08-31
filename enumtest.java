package enumset;
import java.util.Scanner;
public class enumtest {
     public static void main(String[] args)
     {
         Scanner in=new Scanner(System.in);
         String d;
         System.out.println("enter the day in small letters");
         d=in.nextLine();
         Enumset e=new Enumset(Days.valueOf(d));//enum call
         System.out.println("Movie telecasted on Vijay Television is");
         e.displayMovie();
    }
}
