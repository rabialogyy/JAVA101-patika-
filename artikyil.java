import java.util.Scanner;
public class artikyil {
    public static void main (String[]args){
        System.out.println("Artık Yıl Hesaplama");

        Scanner inp=new Scanner ( System.in);
        int yil;
        System.out.println("Yıl Giriniz:");
        yil=inp.nextInt();


        if (yil>=1000){
            if (yil%4==0){
                System.out.println(yil +" bir artık yıldır.");
            }
            else {
                System.out.println(yil +"bir artık yıldır değildir.");
            }
        }

        if (yil>0 && yil<1000){
            if (yil%400==0){
                System.out.println(yil+"bir artık yıldır.");
            }
            else {
                System.out.println(yil+"bir artık yıldır değildir.");
            }
        }








    }





















}
