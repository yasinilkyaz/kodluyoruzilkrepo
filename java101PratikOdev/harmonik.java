import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner (System.in);

        System.out.println ("n sayını giriniz  :");
        sayi=input.nextInt();
        double sonuc=0.0;
        for(double i =0.0;i<= sayi;i++){
            sonuc +=(1.0/sayi);

        }
        System.out.println(sonuc);
    }
}