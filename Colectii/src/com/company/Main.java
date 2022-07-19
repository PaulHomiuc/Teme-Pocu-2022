package com.company;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // example 1
    // a method that creates a list of 10 random numbers with values from 0 to 20
    public static void RandomNums(){
        Random random = new Random();
        int max=20;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (list.size()<10){
            int newRandom = random.nextInt(max);
            if(!list.contains(newRandom))
                list.add(newRandom);

        }
        System.out.println(list.toString());

    }
    //example 2
    public static void RemoveDuplicateChars(){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        List<Character> list =line.chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());
        System.out.println(list.toString());
        Set<Character> charsSet = line.chars()
                .mapToObj(e->(char)e).collect(Collectors.toSet());
        System.out.println("No duplicates:  " + charsSet.toString());

    }
    // example 3
    public static List<student> removeStudents(List<student> list){
        Set<student> s= new HashSet<student>();
        s.addAll(list);
        list = new ArrayList<student>();
        list.addAll(s);

        return list;
    }


    public static void main(String[] args) {
        RandomNums();
        RemoveDuplicateChars();
        ArrayList<student> list = new ArrayList<>();
        student s1 = new student("Ion Ionescu",7,50003);
        student s2 = new student("George Petrescu",10,123);
        student s3 = new student("Alexandru Pop",6,232);
        list.add(s1);
        list.add(s3);
        list.add(s1);
        list.add(s2);
        list.add((s3));
        System.out.println(list.toString());
        List<student> listUnic = new ArrayList<>();
       listUnic.addAll( removeStudents(list));
        System.out.println("duplicates removed: "+"\n" +  listUnic.toString());

       // example 4
        LinkedHashSet<student> studentSet
                = new LinkedHashSet<student>();
        Iterator<student> itstudent= studentSet.iterator();
        studentSet.addAll(list);
        System.out.println(studentSet);
        while(itstudent.hasNext())
        {
            //example 5
            if(s1.equals(itstudent.next()))
            {System.out.println("Element "+s1.toString()+"  was found in hashset");
                break;
            }
        }
        //example 6
        HashMap<Integer,String> hashmap= new HashMap<>();
        hashmap.put(s1.getPersonalCode(),s1.getName());
        hashmap.put(s2.getPersonalCode(),s2.getName());
        hashmap.put(s3.getPersonalCode(),s3.getName());

        for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }

        //example 7

        Collections.sort(list);

        System.out.println("Sorted : " + list.toString());

    }
}
