package com.ShopManager;

import java.util.*;

public class ShopManager {



    public static void main(String[] args) {
        Product p1 = new Product("Candy",5);
        Product p2 = new Product("Ice cream",10);
        ArrayList<Product> products2 = new ArrayList<>();
        ArrayList<Product> products1 = new ArrayList<>();
        products2.add(p1);
        products2.add(p2);
        Product p3 = new Product("Laptop", 2000);
        Product p4 =new Product("Router",100);
        products1.add(p3);
        products1.add(p4);



        Shop s1 =new Shop("Grocery","Albina",products2,2003);
        Shop s2 =new Shop("Technology","Electronics King",products1,2010);
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(s1);
        shops.add(s2);

        Scanner scan = new Scanner(System.in);
        String choice;
        do {    System.out.println("\n1 - Print the name of each shop in capital letters.");
                System.out.println("2 - Print the name of each shop opened after 2005.");
            System.out.println("3 - Print the name of each product");
            System.out.println("4 - Print the name of the cheapest product");
            System.out.println("5- Print the price sum of all technology shops ");
            System.out.println("6- Print the concatenation of all shop names separated by |  using collect method");

            choice = scan.nextLine();
            switch (choice){
                case "1":
                    shops.forEach(elem -> {System.out.println( elem.getName().toUpperCase(Locale.ROOT));
                        });
                    break;
                case "2":
                    shops.forEach(elem -> {
                        if(elem.openingYear>2005)
                        System.out.println( elem.getName());
                    });
                    break;
                case "3": shops.forEach(elem -> {
                    elem.products.forEach(prod -> System.out.println(prod.getName()));

                });
                    break;
                case "4":
                   // double x =  shops.stream().mapToDouble(elem -> elem.products.stream().mapToDouble(elem1->elem1.price).min()).min();
                    OptionalDouble x = products2.stream().mapToDouble(elem -> elem.getPrice()).min();
                    System.out.println("min price: " + x);
                    break;
                case "5":
                 double sumOfTech = shops.stream().filter(elem->elem.getDomain().equals("Technology")).mapToDouble(elem -> elem.products.stream().mapToDouble(elem1->elem1.price).sum()).sum();
                   System.out.println(" should be 2100 " + sumOfTech);
                    break;
                case "6":
                    shops.forEach(elem -> {
                        String ConcatName = new String();
                        ConcatName += elem.getName()+ " | ";
                        System.out.print(ConcatName);
                    });
                    break;



            }

        }while (!choice.equals("q"));


    }
}
