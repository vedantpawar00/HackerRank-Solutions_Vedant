// Print "Hello World"  amount of times. The input portion will be handled automatically. You need to write a function with the recommended method signature.
// Input Format
// A single line of input containing integer , the number of times to print "Hello World".

import java.util.Scanner;

public class HelloWorldN 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++)
        {
            System.out.println("Hello World");
        }

        sc.close();
    }
}
