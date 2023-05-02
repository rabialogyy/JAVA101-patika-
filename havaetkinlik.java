import java.util.Scanner;
public class havaetkinlik {
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);

        double temperature;

        System.out.println("Sıcaklık Değerini Giriniz:");
        temperature=input.nextDouble();

        if (temperature<=5){
            System.out.println("Kayak");
        } else if (temperature > 5 && temperature<=15) {
            System.out.println("Sinema");
        } else if (temperature>15 && temperature<=25) {
            System.out.println("Piknik");

        } else if (temperature>25) {
            System.out.println("Yüzme");

        }


    }












}
