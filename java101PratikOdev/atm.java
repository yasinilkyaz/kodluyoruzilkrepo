import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ad,parola;
        Scanner input = new Scanner(System.in);

        int secim,hesap=1000,yatırma,cekme,girisHakkı=3;
        while (girisHakkı>0) {
            System.out.println("kullanıcı adı giriniz");
            ad =input.nextLine();
            System.out.println("parolanız");
            parola = input.nextLine();

            if (ad.equals("yasin") && parola.equals("atm")) {
                do {


                    System.out.println("Bankamıza hoşgeldiniz\n" +
                            "lütfen işleminizi seçiniz\n" +
                            "1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");

                    secim = input.nextInt();
                    switch (secim) {
                        case 1:

                            System.out.println("yatırılcak tutarı giriniz");
                            yatırma = input.nextInt();
                            hesap += yatırma;
                            System.out.println("yatırma işleminiz başarıyla gerçekleşti");
                            break;
                        case 2:
                            System.out.println("Çekilecek tutarı giriniz");
                            cekme = input.nextInt();
                            if (cekme < hesap) {
                                hesap -= cekme;
                                System.out.println("Çekme işleminiz başarıyla gerçekleşti");
                            } else {
                                System.out.println("Bakiyeniz yetersiz");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz =" + hesap + " TL");
                            break;
                        case 4:
                            System.out.println("iyi günler");
                            break;
                        default:
                            System.out.println("geçersiz işlem");
                            break;


                    }
                } while (secim < 4);
            } else {
                System.out.println("kullanıcı adı veya parolanız hatalı");
                girisHakkı--;
                if (girisHakkı == 0) {
                    System.out.println("Kartınız Bloke edildi. Banka ile iletişime geçin");
                }
            }

        }
    }
}

