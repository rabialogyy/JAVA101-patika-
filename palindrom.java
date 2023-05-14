import java.util.Scanner;

public class palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
           // System.out.println("Number=>" + number);

            lastNumber = temp % 10;
           // System.out.println("son basamak =>" + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
           // System.out.println("yeni sayı =>" + reverseNumber);

            temp /= 10;
            // son basamağı tersten başa yazma formulu
        }
        if (number==reverseNumber)
           return true;

        else
            return false;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(101));



        /*
        int number=2476;
        int a= number / 10 ;
        System.out.println(a);  // son basamak silme formülü

         */

       /*
        int number=2476;
        int a= number % 10 ;
        System.out.println(a); // son basamak bulma formülü

        */


    }
}
