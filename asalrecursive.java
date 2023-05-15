import java.util.Scanner;

public class asalrecursive {

    static int asal(int a) {

        int asd = 0;

        int result = a % 2;
        if (result == 1) {
            System.out.println(a + " Sayısı asaldır.");

        } else {
            System.out.println(a + " Sayısı asal değildir.");

        }
        return asd;


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz:");
        int a = input.nextInt();
        System.out.println(asal(a));


    }
}
