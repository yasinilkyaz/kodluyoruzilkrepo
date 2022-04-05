import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe,kmttr,min,acilis,yol,tutar,durum;

        kmttr=2.2;
        acilis=10;
        min=20;
        System.out.println("kaç km gidilecek");
        mesafe=input.nextInt();
        yol=mesafe*kmttr;
        tutar=yol+acilis;

        durum= tutar>=20? tutar:min;
        System.out.println("ödenecek tutar  "+durum);
    }
}
