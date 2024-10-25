// his is an introductory challenge. The purpose of this challenge is to give you a working I/O template in your preferred language. It includes scanning  integers from STDIN, calling a function, returning a value, and printing it to STDOUT.
// Your task is to scan two numbers,  and  from STDIN, and print the sum  on STDOUT.

import java.util.Scanner;

public class SolveMeFirstFP
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd num: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum: " + sum);

        sc.close();
    }
}