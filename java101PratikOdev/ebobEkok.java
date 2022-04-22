import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("1. sayi: ");
        int n1 = inp.nextInt();
        System.out.println("2. sayi: ");
        int n2 = inp.nextInt();
        int kSayi;
        int ebob = 1;
        int ekok;
        int deger = 1;
        if (n1 < n2) {
            kSayi = n1;
        } else {
            kSayi = n2;
        }
        while (deger <= kSayi) {
            if (n1 % deger == 0 && n2 % deger == 0) {
                ebob = deger;
            }
            deger++;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Ekok: " + ekok);
        System.out.println("Ebob: " + ebob);
    }
