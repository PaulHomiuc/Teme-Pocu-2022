package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void before1990 (){


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "paul", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(  "select * from person where YEAR(BIRTHDATE)<1990;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name")+" " + resultSet.getString("birthdate"));
            }

        }catch(Exception e)
        {e.printStackTrace();}
    }
    public  static void  sameCityAsBorn(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "paul", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(  "select * from person p, adress a where p.id=a.id and p.birthplace=a.city ;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name")+" " + resultSet.getString("birthplace"));
            }

        }catch(Exception e)
        {e.printStackTrace();}

    }
    public static void  personsLivingInTheSameCity(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "paul", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(  "select p1.name,p2.name from person p1,person p1, where p1.id!=p2.id and p1.birthplace=p2.birthplace ;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("p1.name")+" " + resultSet.getString("p2.name"));
            }

        }catch(Exception e)
        {e.printStackTrace();}
    }
    public static void  samePhoneProvider (){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "paul", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(  "select p1.name,p1.birthday, f1.service_provider\n" +
                    "from person p1, phone_number f1, person p2, phone_number f2\n" +
                    "where p1.person_id=f1.person_id and p1.person_id!=p2.person_id and f2.person_id=p2.person_id\n" +
                    "and f1.service_provider=f2.service_provider;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name")+" " + resultSet.getString("service_provider"));
            }

        }catch(Exception e)
        {e.printStackTrace();}
    }



    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "paul", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from person");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") );
            }

    }catch(Exception e)
    {e.printStackTrace();}

        before1990();



}}
