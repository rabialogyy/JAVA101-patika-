package MayinTarlasiOyunu;


import java.util.Random;
import java.util.Scanner;


public class oyun {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz:");
        int row= input.nextInt();
        System.out.println("Sütun  sayısını giriniz:");
        int col= input.nextInt();
        MayinTarlasiOyunu.MineSwepper mineSwepper = new MayinTarlasiOyunu.MineSwepper(row,col);
        mineSwepper.run();
    }
}