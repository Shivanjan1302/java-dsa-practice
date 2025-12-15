import java.util.*;
public class reversearray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        reverse(array);
    }
    static void reverse(int arr[])
    {
        int first=0;
        int last=arr.length-1;
        while (first<last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
