import java.util.Scanner;

public class Main {

    static int usluSayi(int c,int d){
        int sonuc=c;
        for(int i=1;i<d;i++)
        {
            sonuc*=c;
        }
        System.out.println(sonuc);
        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int a =scan.nextInt();
        System.out.println("üssünü giriniz");
        int b =scan.nextInt();
        usluSayi(a,b);

    }

}