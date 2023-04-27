import java.util.Scanner;
public class dairehesap {
     public static void main(String[]args){
         Scanner input=new Scanner(System.in);

         double r ,π=3.14,alan, cevre;

         System.out.print("yarıçap giriniz:");
         r = input.nextDouble();

          alan = (π*(r*r));
          cevre =( 2*π*r);
         System.out.println("Dairenin alanı:"+alan);
         System.out.println("Dairenin çevresi:"+cevre);





    }


}
