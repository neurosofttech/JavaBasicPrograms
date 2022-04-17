package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        //HashMap<Integer,String> map=new HashMap<Integer,String>();

       HashMap<Integer,String> pp=new HashMap<Integer,String>();

      //  HashMap<String, Integer> pp2=new HashMap<String, Integer>();

        pp.put(101,"AAAAA");

        pp.put(102,"BBBB");
        pp.put(103,"CCCC");
        pp.put(104,"DDDD");


        //System.out.println(pp);

        for(Map.Entry mm:pp.entrySet())
        {
            //System.out.println(mm.getKey()+" "+mm.getValue());
            //System.out.println(mm.getKey());
            System.out.println(mm.getValue());
            //System.out.println(mm);
        }




    }
}
