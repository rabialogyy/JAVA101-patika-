import java.util.Scanner;

public class desen {
    static void number() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        int n = input.nextInt();


        int sayı = n;
        System.out.println("Girdiğiniz sayı :" + sayı);

        for (int i = n; i > 0; i -= 5) {
            sayı -= 5;
            System.out.println(sayı + " ");

        }

        int sonsayi = sayı;
        for (int i = sonsayi; i < n; i += 5) {
            sonsayi += 5;
            System.out.println(sonsayi + " ");

        }


    }

    public static void main(String[] args) {


        number();


    }


}
