// For a given list with  integers, return a new list removing the elements at odd positions. 
import java.util.Scanner;

public class FilterPositionsInList 
{
    static void fun(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size: ");
        int size = sc.nextInt();
        
        System.out.print("Array: ");
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Even Elements: ");
        fun(arr);

        sc.close();
    }
}
