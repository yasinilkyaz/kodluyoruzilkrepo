import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,islem;
        double sonuc;

        System.out.print("değer giriniz:");
        sayi1=input.nextInt();

        System.out.println("2. değeri giriniz");
        sayi2=input.nextInt();

        System.out.println("1 toplama");
        System.out.println("2 çıkarma");
        System.out.println("3 çarpma");
        System.out.println("4 bölme");
        System.out.println("İşlemi seçiniz");
        islem=input.nextInt();

        switch (islem){
            case 1:
                System.out.println("toplama işlemi sonucu = "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("çıkarma işlemi sonucu = "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("çarpma işlemi sonucu = "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("bölme işlemi sonucu = "+(sayi1/sayi2));
                break;
        }

    }
}
