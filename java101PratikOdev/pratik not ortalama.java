import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fzk, kmy, trk, trh, mzk;
        String durum;
        System.out.println("Matematik notunu giriniz");
        mat = input.nextInt();

        System.out.println("Fizik notunu giriniz");
        fzk = input.nextInt();

        System.out.println("Kimya notunu giriniz");
        kmy = input.nextInt();

        System.out.println("Türkçe notunu giriniz");
        trk = input.nextInt();

        System.out.println("Tarih notunu giriniz");
        trh = input.nextInt();

        System.out.println("Müzik notunu giriniz");
        mzk = input.nextInt();

        double toplam = (mat + fzk + kmy + trk + trh + mzk);
        double ort = toplam / 6.0;


        durum =ort >= 60 ? "Başarıyla geçtiniz Ortalamanız" : "Malesef kaldınız Ortalamanız";

        System.out.println(durum);
        System.out.println(ort);
    }
}