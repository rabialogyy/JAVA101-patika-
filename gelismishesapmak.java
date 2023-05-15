import java.util.Scanner;

public class gelismishesapmak {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam :" + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Sonuç:" + result);
        return result;
    }

    static int multip(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım:" + result);
        return result;
    }

    static int divid(int a, int b) {
        if (b == 0) {
            System.out.println("ikinci sayı 0 dan farklı olmalı.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm:" + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod :" + result);
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi:" + (2 * (a + b)));
        System.out.println("Alanı:" + (a * b));
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış yap";
        System.out.println(menu);
        while (true) {

            System.out.print("Yapmak istediğİniz işlemi seçiniz:");
            select = input.nextInt();

            if (select == 0) {
                break;
            }


            System.out.print("ilk sayıyı giriniz:");
            int a = input.nextInt();
            System.out.print("ikinci sayıyı giriniz:");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multip(a, b);
                    break;
                case 4:
                    divid(a, b);

                    break;
                case 5:
                    System.out.println("Üs hesabı:" + power(a, b));
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }
        System.out.println("Güle Güle");

    }
}
