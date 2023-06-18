package MayinTarlasiOyunu;

import com.sun.security.jgss.GSSUtil;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSwepper {
    int rowNumber;
    int colNumber;
    String[][] mineMap;
    String[][] gameMap;
    int mineNumber;
    int a;
    int b;
    int count;
    boolean isTrue = true;


    public MineSwepper(int row, int col) {
        this.rowNumber = row;
        this.colNumber = col;
        this.gameMap = new String[row][col];
        this.mineMap = new String[row][col];
        this.mineNumber= (row * col) / 4;

    }

    public void mayinMap() {    // boş mayın tarlası
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";

            }
        }
    }

    public void randomNumber() {    // random değerlerde mayın ataması
        Random r = new Random();
        for (int i = 0; i < this.mineNumber; i++) {
            int rsayi = r.nextInt(this.rowNumber);
            int rsayi2 = r.nextInt(this.colNumber);
            if (!this.mineMap[rsayi][rsayi2].equals("*")) {
                this.mineMap[rsayi][rsayi2] = "*";
            }
        }
    }

    public void printmayinMap() { // mayınların bulunduğu konumu gösteren harita
        System.out.println("Mayınların Konumu");
        randomNumber();
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if (!this.mineMap[i][j].equals("*")) {   // mayın olmayan yerlere - değer atandı
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("==================================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");


    }


    public void printGameMap() {     // gameMape göre oyun haritası oluşturuldu
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.gameMap[i][j] = "-";
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void valuetion() {    /// kullanıcıdan oyunu oynaması için satır ve sütun sayısı değerleri alındı ( indis seçimi)
        Scanner inp = new Scanner(System.in);
        isTrue = false; // oyunu kazanmadıysa değer almaya devam eder
        while (!isTrue) {
            System.out.print("Satır Giriniz : ");
            a = inp.nextInt();
            System.out.print("Sütun Giriniz : ");
            b = inp.nextInt();
            if (a > rowNumber || b > colNumber) {
                System.out.println("Harita sınırları dışında seçim yaptınız!");
                continue;
            }
            if (mineMap[a][b].equals("*")) {
                System.out.println("Oyunu kaybettiniz !");
                break;

            }
            control();
            if (finish()) {

                System.out.println("Tebrikler oyunu kazandınız :))");
                break;
            }
        }
    }

    public void control() {  // seçilen indisin yakınlarındaki  mayın kontrolu
        count = 0;
        for (int i = (a - 1); i <= (a + 1); i++) { // satırı gezınme
            for (int j = (b - 1); j <= (b + 1); j++) { // sütunu gezinme
                if (i < 0 || j < 0 || i >= this.rowNumber || j >= this.colNumber) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        this.gameMap[a][b] = String.valueOf(count);
        this.mineMap[a][b] = String.valueOf(count);
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finish() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void run() {
        mayinMap();
        printmayinMap();
        valuetion();
    }
}