package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.company.IncorrectFileNameException;

public class Main {

    public static void method1()
    {   System.out.println("method 1");
        method2();
    }
    public static void method2(){
        System.out.println("method 2");
        method3();
    }
    public static void method3(){
        System.out.println("method 3");
        method4();
    }
    public static void method4(){

        System.out.println("Method 4");
        String fileName ="indsd.txt";
        try (Scanner file = new Scanner(new File(fileName))) {
            if (file.hasNextLine())
                System.out.println(file.nextLine());
        } catch (FileNotFoundException e) {

            try {
                throw new IncorrectFileNameException("Incorrect filename : " + fileName );
            } catch (IncorrectFileNameException ex) {
                ex.printStackTrace();
            }
        }


    }
    public static void main(String[] args) {
method1();


    }
}
