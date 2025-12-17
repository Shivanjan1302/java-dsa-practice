import java.util.*;
public class ArrayFrequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size = ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements = ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element for frequency check = ");
        int freq=sc.nextInt();
        checkFreq(arr,freq);
    }
    static void checkFreq(int[] arr,int freq)
    {
        boolean f=false;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == freq)
                c++;
        }
        if(c == 0)
        {
            System.out.println("frequency= does not exist");
        }
        else
            System.out.println("frequency= "+c);
    }
}
