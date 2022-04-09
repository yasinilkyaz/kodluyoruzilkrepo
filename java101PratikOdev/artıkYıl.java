import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int yil,mod4,mod400;
    Scanner input=new Scanner(System.in);
        System.out.println("yılı giriniz");
        yil=input.nextInt();
        mod400=yil%400;
        mod4=yil%4;
        if(mod400==0){
            System.out.println(yil+" yılı artık bir yıldır ");
        }
        else if(mod4==0){
            System.out.println(yil+" yılı artık bir yıldır ");
        }
        else{
            System.out.println(yil+" yılı artık bir yıl değildir");
        }

    }
}
