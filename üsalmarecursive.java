import java.util.Scanner;


public class üsalmarecursive {
    static int power(int a, int b) {


        if (b == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;

            }
            return result;

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz:");
        int a = input.nextInt();
        System.out.print("Üs sayıyı giriniz:");
        int b = input.nextInt();

        System.out.println("Sonuç:" + power(a, b));
    }


}
