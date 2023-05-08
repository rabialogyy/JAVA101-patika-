import java.util.Scanner;

public class tersucgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Ters üçgen yapan program");

        int n;
        System.out.println("Basamak sayısı giriniz:");
        n = inp.nextInt();

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
