package arrayset;
import java.util.Arrays; //importing arrays
import java.util.Scanner; //importing scanner
public class Arrayset {
    public static void main(String[] args) {
        int[] rainfall_array=new int[5];
        Arrays.fill(rainfall_array, 32); //fill function
        System.out.println("after filling a array with one number");
        for(int n:rainfall_array)//enhanced for
        {
            System.out.println(n+" ");
        }
        Scanner inp=new Scanner(System.in);// scanner object
        int[] arr=new int[5];//array declaration
        System.out.println("enter five elements");
        for(int i=0;i<5;i++)
        {
            arr[i]=inp.nextInt();
        }
        int[] arr_copy=new int[5];
        Arrays.sort(arr);//array sort funnction
        System.out.println("entered elements after sorting");
        for(int n:arr)
        {
            System.out.println(n);
        }
        System.arraycopy(arr, 0, arr_copy, 0, arr.length);//array copy function
        System.out.println("copyed elements from entered elements after sorting");
        for(int n:arr_copy)
        {
            System.out.println(n);
        } 
        boolean b=Arrays.equals(arr,arr_copy);//comparing array function
        System.out.println("array compared with copied array");
        System.out.printf("arr %s arr_copy",(b?"==":"!="));
        System.out.println();
        System.out.println("array compared with unordered entered_array");
        b=Arrays.equals(arr,rainfall_array);
        System.out.printf("arr %s rainfall_arr",(b?"==":"!="));
        System.out.println();
        int c;
        System.out.println("enter the element to search");
        c=inp.nextInt();
        int loc=Arrays.binarySearch(arr, c);
        if(loc>=0 && loc<=arr.length)
        {
            System.out.printf("%d is found in %d position",c,loc+1);
        }
        else
        {
            System.out.printf("%d is not present in the array",c);
        }
    }
    
}
