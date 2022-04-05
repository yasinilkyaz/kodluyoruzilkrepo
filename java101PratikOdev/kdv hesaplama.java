import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvsiz,kdvli,eklenenKdv;

        kdvsiz = input.nextInt();

        eklenenKdv = kdvsiz*0.18;
        System.out.println("ürünün kdv tutarı  "+eklenenKdv);

        kdvli=kdvsiz+eklenenKdv;
        System.out.println("ürünün kdvli satış tutarı  "+kdvli);
    }
}