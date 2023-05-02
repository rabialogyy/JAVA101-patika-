import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day, select;


        System.out.println("1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
        System.out.print("Doğum ayınızı seçiniz:");
        select = input.nextInt();

        System.out.print("Doğum gününüzü giriniz:");
        day = input.nextInt();

        if (select == 1) {
            if (day <= 22) {
                System.out.print("Burcunuz Oğlak");
            } else {
                System.out.println("Burcunuz Kova");
            }

        }

        if (select == 2) {
            if (day <= 19) {
                System.out.println("Burcunuz Kova ");
            } else {
                System.out.println("Burcunuz Balık");
            }

        }
        if (select == 3) {
            if (day <= 20) {
                System.out.println("Burcunuz Balık ");
            } else {
                System.out.println("Burcunuz Koç");
            }

        }

        if (select == 4) {
            if (day <= 20) {
                System.out.println("Burcunuz Koç");
            } else {
                System.out.println("Burcunuz Boğa");
            }
        }

        if (select == 5) {
            if (day <= 21) {
                System.out.println("Burcunuz Boğa");
            } else {
                System.out.println("Burcunuz İkizler.Siz çok zor bir burç değil aksine mükemmel bir burçsunuz <3");
            }
        }

        if (select == 6) {
            if (day <= 22) {
                System.out.println("Burcunuz İkizler.Siz çok zor bir burç değil aksine mükemmel bir burçsunuz <3");
            } else {
                System.out.println("Burcunuz Yengeç");
            }
        }

        if (select == 7) {
            if (day <= 22) {
                System.out.println("Burcunuz Yengeç");
            } else {
                System.out.println("Burcunuz Aslan");
            }
        }

        if (select == 8) {
            if (day <= 22) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Burcunuz Başak");
            }
        }
        if (select == 9) {
            if (day <= 22) {
                System.out.println("Burcunuz Başak");
            } else {
                System.out.println("Burcunuz Terazi");
            }
        }
        if (select == 10) {
            if (day <= 22) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("BURCUNUZ MAALESEF AKREP ALLAH KURTARSIN");
            }
        }
        if (select == 11) {
            if (day <= 21) {
                System.out.println("BURCUNUZ MAALESEF AKREP ALLAH KURTARSIN");
            } else {
                System.out.println("Burcunuz Yay");
            }
        }

        if (select == 12) {
            if (day <= 21) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Burcunuz Oğlak");
            }

        }


    }


}
