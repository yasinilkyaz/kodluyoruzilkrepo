import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,hipot,cevre,alan,u;
        System.out.println("A kenarını giriniz");
        a=input.nextInt();
        System.out.println("B kenarını giriniz");
        b=input.nextInt();
        hipot=Math.sqrt((a*a)+(b*b));
        System.out.println("Üçgenin hipotenüsü   "+hipot);

        cevre=a+b+hipot;
        u=cevre/2;
        alan=Math.sqrt((u*(u-a)*(u-b)*(u-hipot)));
        System.out.println("üçgenin alanı   "+alan);

    }
}