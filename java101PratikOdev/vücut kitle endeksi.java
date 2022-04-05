import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy,sonuc;

        System.out.println("boyunuzu metre cinsinden giriniz");
        boy=input.nextDouble();
        System.out.println("kilonuzu giriniz");
        kilo=input.nextDouble();
        sonuc=kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz  "+sonuc);


    }
}