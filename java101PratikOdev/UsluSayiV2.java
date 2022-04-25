import java.util.Scanner;

public class Main {

    static int usluSayi(int c,int d){
        int sonuc=c;
        for(int i=1;i<d;i++)
        {
            sonuc*=c;
        }
        System.out.println("sonuç : "+sonuc);
        return 1;
    }
    public static void main(String[] args) {
        int loop=1;
        while (loop<5) {
            Scanner scan = new Scanner(System.in);
            System.out.print("taban değerini giriniz :");
            int a = scan.nextInt();
            System.out.print("Üs değerini giriniz :");
            int b = scan.nextInt();
            usluSayi(a, b);
        }
    }

}