import java.util.Scanner;
 public class hipotenus {
     public static void main(String[]args) {
         System.out.println("Dik Üçgende Hipotenüs Bulan Program ");
         int a,b, hipotenus;
         double c;
         Scanner inp=new Scanner(System.in);

         System.out.println("1.dik kenar uzunluğunu giriniz:");
         a=inp.nextInt();
         System.out.println("2.dik kenar uzunluğunu giriniz:");
         b=inp.nextInt();

         c=Math.sqrt( (a*a)+(b*b) );
         System.out.println("hipotenüs:"+c);



















     }










}