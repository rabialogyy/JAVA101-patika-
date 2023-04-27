import java.util.Scanner;

public class dairedilimhesabi {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);

        double r , pi=3.14,a,alan;

        System.out.print("Yarıçap Giriniz:");
        r =input.nextDouble();

        System.out.print("Merkez açı ölçüsü giriniz:");
        a =input.nextDouble();

        alan =(pi*(r*r)*a)/360;
        System.out.println("Daire Dilim Alanı:"+alan);


    }







}
