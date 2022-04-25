import java.util.Scanner;

public class Main {

    static int islem(int b){
        for(int i=b;i>-4;i-=5){
            System.out.println(i);
            if(i<1) {
                for (int y = i; i < b; y += 5) {
                    if(y<1){
                        y+=5;
                    }
                    if(y==b){
                        System.out.println(b);
                        return 1;
                    }
                    System.out.println(y);
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int a =scan.nextInt();
        islem(a);
    }

}