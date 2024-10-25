// You are given a list of  elements. Reverse the list without using the reverse function.

import java.util.Scanner;

public class ReverseList 
{
    public static void fun(int[] arr)
    {
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();
        
        System.out.print("Array: ");
        int [] arr = new int[size];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Reverse: ");
        fun(arr);

        sc.close();
    }
}
