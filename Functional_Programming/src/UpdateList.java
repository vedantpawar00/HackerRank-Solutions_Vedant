// Count the number of elements in an array without using count, size or length operators (or their equivalents).

import java.util.Scanner;

public class UpdateList 
{
    public static void updateToAbsolute(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = Math.abs(arr[i]);  
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of the list: ");
    int size = sc.nextInt();  
    
    int[] arr = new int[size];
    
    System.out.println("Enter the elements of the list: ");
    for (int i = 0; i < size; i++) 
    {
        arr[i] = sc.nextInt();  
    }

    
    updateToAbsolute(arr);
    
    System.out.println("List with absolute values: ");
    for (int value : arr) 
    {
        System.out.print(value + " ");  
    }

        sc.close();
    }
}
