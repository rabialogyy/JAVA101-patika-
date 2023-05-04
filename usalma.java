import java.util.Scanner;
public class usalma {
    public static void main (String[]arsg){

        Scanner input= new Scanner(System.in);

        int n ,r,total=1;
        System.out.println("taban sayıyı giriniz:");
        n=input.nextInt();

        System.out.println("üs sayısını giriniz:");
        r=input.nextInt();

        for (int i=1; i<=r;i++){
            total*=n; // n'in total kadar kendini çarpması durumu

        }
        System.out.println("Cevap:"+total);



    }
}
