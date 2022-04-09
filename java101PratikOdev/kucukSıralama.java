import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int a,b,c;
    Scanner input=new Scanner(System.in);
    System.out.println("a değerini giriniz");
    a=input.nextInt();
    System.out.println("b değerini giriniz");
    b=input.nextInt();
    System.out.println("c değerini giriniz");
    c=input.nextInt();

    if(a<b && a<c)
    {
        if(c<b)
        {
            System.out.println("a < c < b "+a+c+b);
        }
        else{
            System.out.println("a < b < c "+a+b+c);
        }
    }
    if(b<a&&b<c)
    {
        if(a<c)
        {
            System.out.println("b < a < c "+b+a+c);
        }else{
            System.out.println("b < c < a "+b+c+a);
        }
    }
    if(c<a&&c<b)
    {
        if(a<b)
        {
            System.out.println("c < a < b "+c+a+b);
        }
        else{
            System.out.println("c < b < a "+c+b+a);
        }
    }

    }
}
