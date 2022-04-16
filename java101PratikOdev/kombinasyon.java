import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        Scanner input = new Scanner (System.in);

        System.out.println ("kombinasyon için sayı giriniz  :");
        System.out.print("n sayısını giriniz");
        n=input.nextInt();
        System.out.print("r sayısını giriniz");
        r=input.nextInt();
        int toplamN=1;
        int toplamR=1;
        int toplam = 1;
        for(int i=1;i<=n;i++){
            toplamN=i*toplamN;
        }
        for(int p=1;p<=r;p++){
            toplamR=p*toplamR;
        }
        for(int a=1;a<=(n-r);a++)
        {
            toplam=toplam*a;
        }
        double sonuc=toplamN/(toplamR*(toplam));
        System.out.println("sonuç "+sonuc);
    }
}