import java.util.Scanner;

public class minmaxyazma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, n;
        int min = 0, max = 0;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ".sayıyı giriniz:");
            sayi = input.nextInt();

            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min || min==0) {
                min = sayi;
            }
        }
        System.out.println("En büyük sayı:"+max);

        System.out.println("En küçük sayı:"+ min);

    }


}



