package exceptiondemo;

public class ExceptionTest {
    public static void main(String[] args) {


        try {

            int aaa[]=new int[5];
            aaa[7]=50;


//String name=null;
            String name="Mohammaddssjfdjdsjkdskasjaksldjdaskndadsdabasjasjsksjslakskbshbadnasnkadsaslkj";

            int aa=Integer.parseInt(name);

            System.out.println(aa);

            System.out.println(name.length());



            int a=100;
            int b=0;
            int c;
            int total=a/b;
            System.out.println("Total Value = "+total);
        }


        catch (ArithmeticException e )

        {
            System.out.println("Can not devided by Zyro");

        }

        catch (NullPointerException e )

        {
            System.out.println("Number can not be null");

        }

        catch (NumberFormatException e )

        {
            System.out.println("Number format exception");

        }


        catch (Exception e )

        {
            System.out.println(" exception");

        }


        finally {

            System.out.println(" Finally block Always execute");

        }




    }
}
