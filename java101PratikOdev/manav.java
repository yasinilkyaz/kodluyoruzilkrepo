import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,a,e,d,m,p,tutar;
        armut=2.14;
        elma=3.67;
        domates=1.11;
        muz=0.95;
        patlican=5;

        System.out.println("armut kaç kilo?");
        a=input.nextInt();
        System.out.println("elma kaç kilo?");
        e=input.nextInt();
        System.out.println("domates kaç kilo?");
        d=input.nextInt();
        System.out.println("muz kaç kilo?");
        m=input.nextInt();
        System.out.println("patlıcan kaç kilo?");
        p=input.nextInt();

        tutar=(armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p);

        System.out.println("Toplam tutar : "+tutar+" TL");



    }
}