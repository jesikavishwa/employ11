package enumset;

enum Days{sunday,monday,tuesday,wednesday,thursday,friday,saturday};//enum declaration
public class Enumset
{
    Days d;//enum object
    Enumset(Days d)
    {
        this.d=d;
    }
    public void displayMovie()
    {
        switch(d)
        {
            case monday:
                System.out.println("kathi on 5.00 pm");
                break;
            case tuesday:
                System.out.println("thuppaki on 6.00 pm");
                break;
            case wednesday:
                System.out.println("nanban on 7.00 pm");
                break;    
            case thursday:
                System.out.println("bakavathi on 8.00 pm");
                break;        
            case friday:
                System.out.println("puthiya keeethai on 4.00 pm");
                break;      
            case saturday:
                System.out.println("mersal on 4.30 pm");
                break;     
            case sunday:
                System.out.println("vettaikaran on 6.00 pm");
                break;     
        }
    }
}   
    
    
    

