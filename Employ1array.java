
package employ1array;

import java.util.Scanner;
import date.*;//import date package
public class Employ1array {
int id;
    String name;
    float netsal;
    float annualsal;
    float salary;
    float basicpay;
    float it;
    float hra;
    /*data get method*/
    public void Get()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("\nEnter your id");
        id = input.nextInt();
        System.out.println("\nEnter name");
        name=input.next();
        System.out.println("\nenter basicpay");
        basicpay=input.nextLong();
        System.out.println("\nenter hra");
        hra=input.nextLong();
        System.out.println("\nenter income tax");
        it=input.nextLong();
    }
    Date birth_date;//varible of class date
    Employ1array(int day,int month,int year)//constructor
    {
      this.birth_date=new Date(day,month,year);   
    }
    /*salary calculation method*/
    public void Cal()
    {
        salary=basicpay+hra;
        annualsal=salary*12;
        netsal=annualsal-it;
    }
    /*display method*/
    public void Display()
    {
        System.out.println("\ndetails of the employ");
        System.out.println("\nname:"+name+"\nid:"+id+"\nbirh_date"+birth_date.toString()+"\nannual salary:"+annualsal+"\nnet salary:"+netsal);
    }
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("enter no of employees");
     int n=input.nextInt();
     Employ1array []Emp=new Employ1array[5];//array of object
     for(int i=0;i<n;i++)
     {
     System.out.println("enter date of birth of employ");   
     int date=input.nextInt();
     int month=input.nextInt();
     int year=input.nextInt();
     Emp[i]=new Employ1array(date,month,year);/*initialise obj with constructor*/
     Emp[i].Get();
     Emp[i].Cal();
     Emp[i].Display();
    }
    } 

}

 
    

