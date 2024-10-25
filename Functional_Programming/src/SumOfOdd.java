// You are given a list. Return the sum of odd elements from the given list. 

import java.util.Scanner;

public class SumOfOdd 
{
    static void fun(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] % 2 != 0)
            {
                sum += arr[i];
            }
        }
        System.out.print(sum);
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

        System.out.print("Sum of Odd Elements: ");
        fun(arr);

        sc.close();
    }
}
