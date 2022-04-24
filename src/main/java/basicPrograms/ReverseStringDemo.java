package basicPrograms;

public class ReverseStringDemo {
    public static void main(String args[]) {
        String reverse = ""; // Objects of String class


        String originalString = "ABBA";



        int length = originalString.length();
       // System.out.println(originalString.length());

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + originalString.charAt(i);


        }
        System.out.println(reverse);


      if (originalString.equals(reverse))
           System.out.println("This is a palindrome.");
        else
            System.out.println("This isn't a palindrome.");
    }



}
