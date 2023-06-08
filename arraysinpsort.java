import java.util.Scanner;
import java.util.Arrays;

public class arraysinpsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcıdan alınan değerlere göre sıralama");
        System.out.println("Dizi boyutunu giriniz:");
        int size = input.nextInt();
        int[] numbers = new int[size];

        for (int i = 1; i < size; i++) {
            System.out.println(i + ". elemanı giriniz");
            numbers[i] = input.nextInt();

        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
}
