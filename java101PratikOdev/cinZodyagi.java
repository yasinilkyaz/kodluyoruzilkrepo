
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int dogumYili,sonuc;
        System.out.println("doğum yılınızı yazınız");
        Scanner input=new Scanner(System.in);
        dogumYili=input.nextInt();
        sonuc=dogumYili%12;
        if(sonuc==0)
        {
            System.out.println("Maymun");
        }
        else if(sonuc==1)
        {
            System.out.println("Horoz");
        }
        else if(sonuc==2)
        {
            System.out.println("Köpek");
        }
        else if(sonuc==3)
        {
            System.out.println("Domuz");
        }
        else if(sonuc==4)
        {
            System.out.println("Fare");
        }
        else if(sonuc==5)
        {
            System.out.println("Öküz");
        }
        else if(sonuc==6)
        {
            System.out.println("Kaplan");
        }
        else if(sonuc==7)
        {
            System.out.println("Tavşan");
        }
        else if(sonuc==8)
        {
            System.out.println("Ejderha");
        }
        else if(sonuc==9)
        {
            System.out.println("Yılan");
        }else if(sonuc==10)
        {
            System.out.println("At");
        }
        else
        {
            System.out.println("Koyun");
        }
        System.out.println(sonuc);
    }
}
