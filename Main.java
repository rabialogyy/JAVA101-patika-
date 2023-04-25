import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        // pratıkler

        int mat, fizik, kimya, turkce, tarih,muzik;
         Scanner inp= new Scanner(System.in);

        System.out.println("Matematık notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz :");
        kimya= inp.nextInt();


        System.out.println("Türkce notunuz :");
        turkce= inp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz :");
        muzik = inp.nextInt();
          int toplam= (mat+ fizik+kimya+turkce+muzik);
          double sonuc= toplam/6;

        System.out.println("ortalamanız :" +sonuc);

        String durum = sonuc >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(durum);






    }
    }
