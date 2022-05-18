package com.primearenot;

import java.util.Scanner;

public class prime{
    static boolean isprime(int num)

    {
        boolean isprime = true;
        for (int i = 2; i < num / 2; i++)

        {
            if (num % i == 0)
            {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        boolean result=isprime(num);
        if(result)
            System.out.println(num + "isprime");
        else
            System.out.println(num + "is not prime");
    }
}