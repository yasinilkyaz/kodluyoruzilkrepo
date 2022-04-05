import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi,r,a,sonuc;
        pi=3.14;
        System.out.println("yarıçapı giriniz");
        r = input.nextDouble();
        System.out.println("istenen açının değeriniz giriniz");
        a=input.nextInt();
        sonuc=(pi*(r*r)*a)/360;
        System.out.println(sonuc);

    }
}