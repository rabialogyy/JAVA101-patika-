import java.util.Scanner;
public class asal {
    public static void main(String[]args){


        for(int i=1; i<=100; i++){  // bölünen   oluşturma
             int n=0;
            for (int m=1;m<=i; m++ ){ // bölen oluşturma
                if( i%m==0){
                    n++;

                }

            }

            if(n<=2){
                System.out.println(i);
            }

        }




    }



}
