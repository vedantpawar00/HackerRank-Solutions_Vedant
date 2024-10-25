// Create an array of  integers, where the value of  is passed as an argument to the pre-filled function in your editor. This challenge uses a custom checker, so you can create any array of  integers. For example, if , you could return , , or any other array of equal length.

import java.util.Scanner;

public class ArrayOfNElements 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        System.out.print("Array: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
