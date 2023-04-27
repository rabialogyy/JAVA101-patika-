import java.util.Scanner;
public class taksiucretprogramı {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Taksimetre Hesaplayan Program");

        double ucret,km=2.20,mesafe;
        int min=20;

        System.out.print("mesafe giriniz:");
        mesafe =input.nextDouble();

        ucret=(km*mesafe+10);

        /* 1.yontem
        if (ucret >=20)
        {

        System.out.println("Ücretiniz:"+ucret);
        }




        else if ( ucret<20)
        {

            System.out.println("ücretiniz:"+min);

         */

            // 2.yontem
        
            ucret=(ucret<20)? 20 :ucret;
        System.out.println("Ücretiniz:"+ucret);


        }


    }







