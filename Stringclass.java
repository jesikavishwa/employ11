package stringclass;
public class Stringclass {
   public static void main(String[] args) {
       //string creation
       String s1=new String("good");
       String s2="goodbye";
       String s3="Good Morning";
       String s4="good morning";
       System.out.printf("contents \n s1:%s\ns2:%s\ns3:%s\ns4:%s\n",s1,s2,s3,s4);
       if(s1.equals("good"))//compare 2 strings
       {
           System.out.println("s1 equals hello");
       }
       else
       {
           System.out.println("s1 not equals hello");
       }  
       if(s1=="good")//error occur because s1 is object and good is string,it can't be object
       {
           System.out.println("s1 equals hello");
       }
       else
       {
           System.out.println("s1 not equals hello");
       }    
       if(s3.equalsIgnoreCase(s4))//comparing string with ignoring the upper and lower case
       {
           System.out.println("s3 equals s4 with ignore case");

       }    
       else
       {
           System.out.println("s3 not equals s4");
       } 
       System.out.printf("\ns1.compareTo(s2) is %d",s1.compareTo(s2));//comparing two string but it returns value
       System.out.printf("\ns2.compareTo(s3) is %d",s2.compareTo(s3));
       System.out.printf("\ns3.compareTo(s4) is %d",s3.compareTo(s4));
       System.out.printf("\ns4.compareTo(s1) is %d",s4.compareTo(s1));
    }
    
}
