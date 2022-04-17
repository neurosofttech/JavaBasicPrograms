package test;

import java.util.ArrayList;
import java.util.HashSet;



public final class SetDemo {


   final String name="Mohammad";



    private SetDemo(){




    }


    public static void main(String[] args) {
        // ArrayList<String> list =new ArrayList<String>();

        HashSet<String> list = new HashSet<String>();

        list.add("AAA");

        list.add("BBB");


        list.add("BBB");
        list.add("CCC");
        list.add("AAA");

        list.add("BBB");
        list.add("CCC");

        list.add("Mohammad");
        list.add("BBB");
        list.add("CCC");


        //  System.out.println(list);

        for (String i : list) {


            System.out.println(i);
        }
    }

        static  {

            System.out.println("Hi , I am from static block");
        }


        }






