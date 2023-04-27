import  java.util.Scanner;

public class vucutkıtlehesap {
    public static void main(String[]args){
        System.out.println("Vücut Kitle İndeksi Hesaplama");
        Scanner input=new Scanner(System.in) ;

        double kilo,boy,index;

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
        boy =input.nextDouble();
        
        System.out.println("Lütfen kilonuzu giriniz:");
        kilo =input.nextDouble();

        index = (kilo/(boy*boy));
        System.out.println("Vücut Kitle İndeksiniz:"+index);






    }
}
