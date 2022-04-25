import java.util.Scanner;

public class Main {

    static int asalSayi(int c){
        int sayac=0;
        for (int i=c;i<=c;i++){
            for (int j=2;j<i;j++){
                if (i%j==0)sayac++;


            }
            if (sayac==0){
                System.out.println(i+" Sayısı ASALDIR.");
            }else {
                System.out.println(i+ " Sayısı ASAL DEĞİLDİR");
            }

            sayac=0;

        }

        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exit=-1;
        do {
            System.out.println("çıkış için sıfır a basınız");

            System.out.println("sayı giriniz");
            int a = scan.nextInt();

            if (a==0){
                exit++;
            }else {
                asalSayi(a);
            }

        }while (exit<0);

    }

}