import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        System.out.println("ATM YAPIMI");

        Scanner input = new Scanner(System.in);
        String userName, passWord; // strıng ıfadelerde eşitleme equals ile yapılır.

        int right = 3;
        int balance = 1500 ,price ;
        int select;

        while (right > 0) {

            System.out.print("Kullanıcı adınızı giriniz:");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz:");
            passWord = input.nextLine();
            if (userName.equals("Rabia") && passWord.equals("dev123")) {
                System.out.println("Merhaba Rabia, Kodluyoruz Bankasına Hoş Geldiniz.");

                do {

                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para Miktarı:");
                             price = input.nextInt();
                            balance += price;
                            System.out.println("Paranız Yatırıldı.");
                            break;

                        case 2:

                            System.out.println("Para Miktarı:");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("İşlem Gerçekleştiridi");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz:" + balance);
                            break;
                    }


                } while (select != 4);
                System.out.println("Çıkış Yapılıyor.Tekrar Görüşmek Üzere.");

                break;


            }else{
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya yanlış şifre.Tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz");
                    } else {

                        System.out.println("Kalan hakkınız:" + right);
                    }
                }


            }

        }
    }



