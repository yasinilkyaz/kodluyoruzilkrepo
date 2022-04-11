import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double mesafe,yolucret,ucret,donusIndirim;
    int donusKont,yas;
    yolucret=0.10;
    Scanner input=new Scanner(System.in);
        System.out.println("gidilecek mesafeyi giriniz");
        mesafe=input.nextDouble();

        System.out.println("yaşınızı giriniz");
        yas=input.nextInt();

        System.out.println("biletiniz gidiş dönüş olsun mu?");
        System.out.println("1 evet");
        System.out.println("2 hayır");
        donusKont=input.nextInt();

        switch (donusKont)
        {
            case 1:

                ucret=((mesafe*2)*yolucret);
                donusIndirim=ucret-(ucret*0.2);
                System.out.println("yüzde yirmi gidiş dönüş indirimi uygulandı "+ucret+"indirimli fiyat = "+donusIndirim);
                if(yas<13){

                    donusIndirim=donusIndirim-(donusIndirim/2);
                    System.out.println("Çocuk indirimiyle yeni tutarınız = "+donusIndirim);
                }
                if (yas > 12 && yas < 25) {
                    donusIndirim=donusIndirim-(donusIndirim*0.1);
                    System.out.println("Genç indirimiyle yeni tutarınız = "+donusIndirim);
                }
                if(yas>65){
                    donusIndirim=donusIndirim-(donusIndirim*0.3);
                    System.out.println("yaşlı indirimiyle yeni tutarınız = "+donusIndirim);
                }
                break;
            case 2:
                ucret=mesafe*yolucret;
                donusIndirim=ucret;
                System.out.println(donusIndirim);
                if(yas<13){

                    donusIndirim=donusIndirim-(donusIndirim/2);
                    System.out.println("Çocuk indirimiyle yeni tutarınız = "+donusIndirim);
                }
                if (yas > 12 && yas < 25) {
                    donusIndirim=donusIndirim-(donusIndirim*0.1);
                    System.out.println("Genç indirimiyle yeni tutarınız = "+donusIndirim);
                }
                if(yas>65){
                    donusIndirim=donusIndirim-(donusIndirim*0.3);
                    System.out.println("yaşlı indirimiyle yeni tutarınız = "+donusIndirim);
                }
                break;
            default:
                System.out.println("HATALI giriş yaptınız");
        }



    }
}
