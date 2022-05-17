import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("satır sayısı giriniz");
        int satir=inp.nextInt();
        System.out.println("Sutun sayısı giriniz");
        int sutun=inp.nextInt();
        MineSweeper mineSweeper=new MineSweeper(satir,sutun);
        mineSweeper.run();
    }
}
