import java.util.Scanner;

public class mukemmel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result = 0;

        System.out.print("Bir sayı giriniz:");
        n = input.nextInt();


        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result = result + i;
            }
        }
        if (n == result) {

            System.out.println(n + " Mükemmel sayıdır.");
        } else {
            System.out.println(n +  " Mükemmel sayı değildir.");

        }


    }


}
