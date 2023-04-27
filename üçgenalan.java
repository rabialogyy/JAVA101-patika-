import java.util.Scanner;
public class üçgenalan{
    public static void main(String []args){

         int a,b,c ,cevre;
         double alan,u ;


        Scanner inp=new Scanner(System.in);
        System.out.println("1.kenarı giriniz:");
        a= inp.nextInt();
        System.out.println("2.kenarı giriniz:");
        b= inp.nextInt();
        System.out.println("3.kenarı giriniz:");
        c= inp.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı : " + alan);









    }



}
