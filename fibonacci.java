import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){


        Scanner input= new Scanner(System.in);

        int seri, n1=0, n2=1;

        System.out.println("Fibonacci serisinin eleman sayısını giriniz:");
        seri=input.nextInt();

        for (int i=2; i<seri;i++){
            int next=n1+n2;

            System.out.println(" "+next);

            n1=n2;
            n2=next;
        }








    }


}
