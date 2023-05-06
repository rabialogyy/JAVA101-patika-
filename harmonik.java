import java.util.Scanner;
public class harmonik {
    public static void main (String []args){

        Scanner input = new Scanner ( System.in);
        System.out.println("Harmonik Seri");


        System.out.println("N sayısını giriniz:");
        int n =input.nextInt();
        double result=0.0;


        for ( int i =1;i<=n; i++){
            result+=(1.0 /i); // double / int = double değer ( double değer için birinin double olması yeterli.)
                              // int / int= int


        }
        System.out.println(result);







    }


}
