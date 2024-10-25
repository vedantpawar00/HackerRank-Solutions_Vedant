// Filter a given array of integers and output only those values that are less than a specified value . The output integers should be in the same sequence as they were in the input. You need to write a function with the recommended method signature for the languages mentioned below. For the rest of the languages, you have to write a complete code.

import java.util.Scanner;

public class FilterArray 
{
    public static void fun(int key, int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < key)
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
        
        System.out.print("Key: ");
        int key = sc.nextInt();

        System.out.print("Filtered: ");
        fun(key, arr);

        sc.close();
    }
}
