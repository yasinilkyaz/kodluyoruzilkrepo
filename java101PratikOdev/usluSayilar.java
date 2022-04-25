import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        Scanner input = new Scanner (System.in);


        System.out.print("sayısını giriniz");
        n=input.nextInt();
        System.out.print("üssünü giriniz");
        r=input.nextInt();
        int sonuc=1;
        for(int i=1;i<=r;i++)
        {
            sonuc*=n;
        }
        System.out.println("sonuç= "+sonuc);
    }
}