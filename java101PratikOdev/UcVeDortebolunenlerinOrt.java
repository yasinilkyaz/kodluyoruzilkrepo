import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("değer giriniz");
    int girilenDeger;
    double topla=0,adet=-1,ort;
        girilenDeger=input.nextInt();
    for(int i=0;i<=girilenDeger;i++){
        if(i%3==0 ||i %4==0)
        {
            topla=i+topla;
            adet++;
        }
    }
    ort=topla/adet;
        System.out.println("3 ve 4 e bölünen sayıların ortalaması = "+ort);
    }
}