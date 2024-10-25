// Count the number of elements in an array without using count, size or length operators (or their equivalents).

import java.util.Scanner;

public class ListLength 
{
    public static int countElements(int[] arr)
    {
        int count = 0;
        
        try 
        {
            while (true) 
            {
                // Accessing element until exception is thrown
                @SuppressWarnings("unused")
                int temp = arr[count];
                count++;
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            
        }

        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size: ");
        int size = sc.nextInt();
        
        System.out.println("Array: ");
        int[] arr = new int[size];
        for (int i=0; i<size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int result = countElements(arr);
        System.out.print("Number of elements in the array: "+ result);
        

        sc.close();
    }
}
