package date;
public class Date {
  public int day;
  public int month;
  public int year;
  public int[] days_per_month={0,31,28,31,30,31,30,31,31,30,31,30,31};
  public Date(int day,int month,int year)
  {
      if(month<=0 || month>12)
      {
      }
      if(day<=0 || day>days_per_month[month] && !(month==2 && day==29))
      {
           throw new IllegalArgumentException();
      }          
      else if(month==2 && day==29 && !(year%400 ==0 || (year%4==0 && year%100!=0)))
      {
            throw new IllegalArgumentException();
      }    
       this.day=day;
       this.month=month;
       this.year=year;
  }
    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
   
  
}
