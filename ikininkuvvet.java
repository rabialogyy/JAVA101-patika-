import java.util.Scanner;
public class ikininkuvvet {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);



        System.out.println("4 ve 5'in kuvvetlerini ekrana yazdıran program");


        int n;
        System.out.println("Sınır sayısını giriniz:");
        n=input.nextInt();


        for (int i=1; i<=n;i*=4 ){

            System.out.println(i);

        }
        for (int i=1; i<=n;i*=5 ){

            System.out.println(i);

        }










    }
}

