import java.util.Scanner;
public class faktorıyel {
    public static void  main(String[]args){

        Scanner inp=new Scanner(System.in);

        int n,r,a;
        int totaln=1 ,totalr=1,totalfark=1, fark,sonuc;

        System.out.println("n sayısını giriniz:");
        n=inp.nextInt();

        System.out.println("r sayısını giriniz:");
        r=inp.nextInt();
        fark=n-r;
        for (int i =1; i<=n; i++){
            totaln=totaln*i;
        }
        for(int i=1; i<=r; i++){
            totalr=totalr*i;
        }
        for (int i=1; i<=fark; i++){
            totalfark= totalfark*i;
        }
        sonuc =totaln/(totalr*(totalfark));
        System.out.println("Sonuç:"+sonuc);










    }


}
