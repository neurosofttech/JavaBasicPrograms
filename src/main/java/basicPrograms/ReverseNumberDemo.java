package basicPrograms;

public class ReverseNumberDemo {
    public static void main(String[] args) {
        int rev=0, temp;
        int Originalnumber=4542;//It is the number variable to be checked for reverse

        temp=Originalnumber;

        while(Originalnumber>0){

            rev=(rev*10)+(Originalnumber%10);
            Originalnumber=Originalnumber/10;
        }
        System.out.println(rev);

       /* if(temp==rev)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");*/
    }
}


