import java.util.Scanner;

public class cinzodyak {
    public static void main(String[] args) {
        System.out.println("ÇİN ZODYAK HESAPLAMA");

        Scanner inp = new Scanner(System.in);

        double yil, burc;

        System.out.print("Doğum Yılınızı Giriniz:");
        yil = inp.nextDouble();


        if (yil % 12 == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");

        } else if (yil % 12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz :Horoz");
        }
        else if (yil%12==2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
            
        } else if (yil%12==3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
            
        } else if (yil%12==4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
            
        } else if (yil%12==5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
            
        } else if (yil%12==6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");

        } else if (yil%12==7) {
            System.out.println("Çin Zodyağı Burcunuz Tavşan");

        } else if (yil%12==8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");

        } else if (yil%12==9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");

        } else if (yil%12==10) {
            System.out.println("Çin Zodyağı Burcunuz : At");

        } else if (yil%12==11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");

        }

    }


}




























