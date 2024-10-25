// Given a list, repeat each element in the list  amount of times. The input and output portions will be handled automatically by the grader. You need to write a function with the recommended method signature.

import java.util.Scanner;

public class ListReplication 
{
    public static void fun(int times, int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<times; j++)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many times to multiply: ");
        int times = sc.nextInt();
        
        System.out.print("Size: ");
        int size = sc.nextInt();
        
        System.out.print("Array: ");
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("New: ");
        fun(times, arr);

        sc.close();
    }
}
