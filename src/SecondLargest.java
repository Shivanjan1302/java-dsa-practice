import java.util.*;
class SecondLargest
{
    public static void main(String[] args)
    {
        int[] arr =new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array");
        for(int i=0;i<5;i++)
        {
            arr [i] = sc.nextInt();
        }
        int largest = 0;
        int secondlargest=0;
        for(int i=0;i<5;i++)
        {
            if (arr[i]>largest)
            largest = arr [i] ;
        }
        for(int i=0;i<5;i++)
        {
            if (arr[i]>secondlargest && arr[i]<largest)
                secondlargest = arr [i] ;
        }
        System.out.println("largest is "+largest);
        System.out.println("Second 1largest is "+secondlargest);

    }
}