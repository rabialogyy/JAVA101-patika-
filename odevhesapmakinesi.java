import java.util.Scanner;

public class odevhesapmakinesi {
    public static void main(String[] args) {
        System.out.println(" Basit Hesap Makinesi");

        Scanner input = new Scanner(System.in);
        int a, b, select;

        System.out.println("İlk Sayıyı Giriniz:");
        a = input.nextInt();
        System.out.println("İkini Sayıyı Giriniz:");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4- Bölme ");
        System.out.println("Seçiminizi giriniz :");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.println("Sonuç:" + (a + b));
                break;
            case 2:

                System.out.println("Sonuç:" + (a - b));
                break;

            case 3:
                System.out.println("Sonuç:" + (a * b));
                break;

            case 4:

                System.out.println("Sonuç:" + (a / b));
                break;




            default:
                System.out.println("Hatalı Giriş Yaptınız.Tekrar Deneyiniz!");



        }


    }


}
