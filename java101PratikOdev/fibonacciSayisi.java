
import java.util.Scanner;

public class Main {

    static int fib(int a){
        int sonuc;
        if(a==1||a==2){
            return 1;
        }


        return fib(a-1)+fib(a-2);
    }
    public static void main(String[] args) {
        System.out.println("değer gir");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        fib(n);
        System.out.println(fib(n));
    }

}