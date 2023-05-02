import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {

        System.out.println("Sınıf Geçme Durumu");

        int mat, fizik, kimya, turkce, muzik, ders = 5;

        Scanner inp = new Scanner(System.in);


        System.out.println("Matematık notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz :");
        kimya = inp.nextInt();


        System.out.println("Türkce notunuz :");
        turkce = inp.nextInt();


        System.out.println("Müzik notunuz :");
        muzik = inp.nextInt();
        if (mat <0 || mat > 100) {

            mat = 0;
            ders--;
        }

        if (kimya < 0 || kimya > 100) {

            kimya = 0;
            ders--;
        }

        if (fizik <0 || fizik >100) {

            fizik = 0;
            ders--;
        }

        if (turkce <0 || turkce > 100) {

            turkce = 0;
            ders--;
        }

        if (muzik <0 || muzik >100) {
            muzik = 0;
            ders--;
        }


        double sonuc = (mat + fizik + kimya + turkce + muzik) / ders;

        if (sonuc <= 55) {


            System.out.println("SINIFI GEÇEMEDİNİZ.SENEYE TEKRAR DENEYİNİZ.");
        } else {
            System.out.println("SINIFI GEÇTİNİZ");
        }
        System.out.println("sonuç:" + sonuc);


    }


}
