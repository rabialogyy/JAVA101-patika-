import java.util.Scanner;

public class kullanıcıgris {
    public static void main(String[] args) {

    String username,password,yenileme,newpassword;
    Scanner inp= new Scanner(System.in);


        System.out.println("Kullanıcı Adınız:");
        username=inp.nextLine();

        System.out.println("Şifre Giriniz:");
        password=inp.nextLine();


        if( username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı.");
        }
        else {
            System.out.println("Şifre Yanlış.");
        }
        System.out.println("Şifrenizi Sıfırlamak İstermisiniz ?");
                yenileme=inp.nextLine();
                if (yenileme.equals("evet")){
                    System.out.println("Yeni şifre giriniz.");
                }
                newpassword=inp.nextLine();
                if (newpassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı.Yeni şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }


    }
}







