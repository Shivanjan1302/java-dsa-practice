import java.util.*;
public class maxmin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int array[]= new int[n];
        System.out.println("Enter array elements:");
            for(int i=0;i<array.length;i++)
            {
                array[i]=sc.nextInt();
            }
        max_min(array);
    }
    static void max_min(int arr[])
    {
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
    }

}
