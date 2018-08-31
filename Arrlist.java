package arrlist;
import java.util.ArrayList;
import java.util.Scanner;
public class Arrlist {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        ArrayList<String> fruits=new ArrayList<String>();//array list collection
        System.out.println("enter the fruit");
        String name=inp.nextLine();
        fruits.add(name);//add a fruit to list
        System.out.println("enter the fruit");
        name=inp.nextLine();
        fruits.add(0,name);//add a fruit in index 0
        System.out.println("enter the fruit");
        name=inp.nextLine();
        fruits.add(name);
        System.out.println("contents of fruits");
        for(String n:fruits)//enhanced for statement
        {
            System.out.println(n);
        }    
        System.out.printf("size:%s\n",fruits.size());//array size 
        System.out.println("enter the fruit to delete"); 
        name=inp.nextLine();
        fruits.remove(name);//deleting a fruit
        System.out.println("contents of fruits");
        for(String n:fruits)
        {
            System.out.println(n);
        }
        System.out.printf("size:%s\n",fruits.size());
        System.out.println("enter the fruit to search");
        name=inp.nextLine();
        System.out.printf(name+" is %s in the list\n",fruits.contains(name)?"":"not");//searching a fruit
        }
    
}
