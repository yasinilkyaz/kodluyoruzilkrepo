import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner (System.in);
        int sonuc=0;
        System.out.println ("sayı giriniz  :");
        sayi=input.nextInt();
        while (sayi!=0){
            int basamak=sayi%10;
            sayi/=10;
            sonuc+=basamak;
        }
        System.out.println("girilen sayının basamaklarının toplamı= "+sonuc);
    }
}