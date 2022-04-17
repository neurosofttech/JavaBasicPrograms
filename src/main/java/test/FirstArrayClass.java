package test;

public class FirstArrayClass {
    public static void main(String[] args) {
        // int age=5;
        //System.out.println(" What is your Age? "+ age);

        FirstArrayClass firstarray=new FirstArrayClass();

        firstarray.demo1();


        System.out.println("============================================");
        firstarray.demo2();

        System.out.println("=======================String Array Start here=====================");
        firstarray.nameDemo();

    }

    public void nameDemo(){
        String name[]={"Aaa","bbb","Ccc","ddd","GGGG"};

        for (String a:name ){

            System.out.println(a);
        }

    }


    public void demo1() {

        //int age[]={5,6,10,13,50};


        int age[]=new int[6];
        age[0]=40;
        age[1]=60;
        age[2]=70;

        age[4]=130;
        age[5]=150;

       // System.out.println(age[4]);

        for(int a:age)
        {
            System.out.println(a);
         }

        System.out.println("===============For Start here=============================");
        for (int i=0;     i<age.length;      i++){


            System.out.println(age[i]);


        }






    }

    public void demo2(){

      	int age[]={5,6,10,13,50};

      	//printing array using for-each loop
     for(int i:age)
        	System.out.println(i);
       	}



}




