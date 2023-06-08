import java.util.Arrays;
import java.util.Scanner;
public class arraysinputminmax {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayı=inp.nextInt();
        int [] numbers={15,12,788,1,-1,-778,2,0};
        int min= 0;
        int max =0;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i=0; i<numbers.length;i++){
            if(sayı<numbers[i]){
                max =numbers[i];
                min=numbers[i-1];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :  " + max);





    }
}
