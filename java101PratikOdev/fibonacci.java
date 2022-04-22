import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Deger giriniz: ");
        int n= inp.nextInt();
        int number1=1,number2=1,result=0;

        System.out.println(number1);
        System.out.println(number2);

        for (int i=0;i<n;i++){


         result=number1+number2;
         number1=number2;
         number2=result;


            System.out.println(result);

        }



    }
}