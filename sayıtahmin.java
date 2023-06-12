import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayıtahmin {
    public static void main(String[] args) {
        // random sayı üretme 2.Yöntem
       /* int number = (int) (Math.random() * 100); // double olan randomu ıntegere döndüren kod.
        System.out.println(number);
        */

        // random sayı üretme 1.yöntem
        Random rand =new Random();
        int number= rand.nextInt(100);
        Scanner input =new Scanner(System.in);
        int right =0;
        int selected;
        int []wrong=new int[5];
        boolean isWin=false;

        while (right<5){
            System.out.println("Lütfen tahmininizi giriniz:");
            selected=input.nextInt();
            if (selected<0  || selected>99){

                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                continue;
            }
            if(selected==number){
                System.out.println("Tebrikler, doğru tahmin!");
                isWin=true;
                break;
            }else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected> number){
                    System.out.println(selected+"  sayısı gizli sayıdan daha büyük.");
                }
                else {
                    System.out.println(selected+" sayısı gizli sayıdan daha küçüktür.");
                }
                wrong[right++]=selected;

                System.out.println("Kalan hakkı:"+(5-right));

            }


        }



      if (!isWin){
          System.out.println("Kaybettiniz !");
          System.out.println("Tahminleriniz:"+ Arrays.toString(wrong));
      }
        System.out.println("Gizli sayı: " + number);


    }
}
