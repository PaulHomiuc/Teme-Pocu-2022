package com.company;

import java.security.PublicKey;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {


    public static int factorial (int n){
        int p=1;
        for(int i=2; i<=n; i++)
        {
            p=p*i;
        }
        return p;

    }
    public  static int fibonnaci (int n)
    {

        if(n==1)
            return 0;
        else
            if(n==2)
                return 1;
            else
            {
                int a=0;
                int b=1;
                int aux;
                for(int i=2;i<n;i++)
                {   aux=a+b;
                    a=b;
                    b=aux;

                }
                return b;
            }


    }
    public static boolean Prime (int n)
    {
        for(int i=2;i<=sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static boolean Palindrome(char []a){
        int stop = a.length-1;
        int start =0;
        while(start<=stop)
        {
            if(a[start]!=a[stop])
                return false;

            stop --;
            start ++;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   /* int n =input.nextInt();*/

    for(int n=1;n<10;n++)
    System.out.println(n + " " +Prime(n));
    char []a = input.next().toCharArray();
    System.out.println( Palindrome(a));

    }
}
