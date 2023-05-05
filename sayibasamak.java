import java.util.Scanner;

public class sayibasamak {
    public static void main(String[] args) {
        System.out.println("basamak sayılarının toplamı");

        Scanner inp = new Scanner(System.in);

        int a=1643 ,b, count=0,sonuc=0;

        while (a!=0){
            count++;
            b=a;
            b=(a%10);
            a/=10;

            sonuc =b+sonuc;


        }
        System.out.println(sonuc);









    }


}
