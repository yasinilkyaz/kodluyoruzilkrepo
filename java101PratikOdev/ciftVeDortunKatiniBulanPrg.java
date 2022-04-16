import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int a,toplam=0;
        do{
            System.out.println("sayı giriniz");
            a=input.nextInt();
            if(a%4==0){
                toplam+=a;
            }
        }
        while (a%2==0);
        System.out.println("girdiğiniz değerlerin toplamı "+toplam);


    }
}
