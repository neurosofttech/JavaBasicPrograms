package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> li =new ArrayList<String>();
        li.add("100");

        li.add("AAA");

        li.add("BBB");


        li.add("BBB");
        li.add("CCC");
        li.add("AAA");

        li.add("BBB");
        li.add("CCC");

        li.add("Mohammad");
        li.add("BBB");
        li.add("CCC");


        System.out.println("=======");
        Iterator itr1=li.iterator();
        while(itr1.hasNext()){//check if iterator has the elements
            System.out.println(itr1.next());//printing the element and move to next
        }

        System.out.println("=======");


        System.out.println(li);


        for(String i:li)

        {


            System.out.println(i);
        }




        /*


        ArrayList<Integer> list2 =new ArrayList<Integer>();

        list2.add(101);
        list2.add(102);
        list2.add(103);
        list2.add(101);
        list2.add(102);
        list2.add(103);
        list2.add(101);
        list2.add(102);
        list2.add(103);
        list2.add(101);
        list2.add(102);
        list2.add(103);
        System.out.println(list2);*/

    }
}
