import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int mat,fzk,trk,kmy,mzk,ort;
    Scanner input=new Scanner(System.in);
    int i=0,havuz=0;

        System.out.println("Matematik notunu giriniz");
        mat=input.nextInt();

        if(mat>0 && mat<100)
        {
            i++;
            havuz=havuz+mat;
        }
        else {
            System.out.println("girdiğiniz değer 0 ile 100 arasında olmadığı için değerlendirmeye alınmayacak");
        }

        System.out.println("fizik notunu giriniz");
        fzk=input.nextInt();

        if(fzk>0 && fzk<100)
        {
            i++;
            havuz=havuz+fzk;
        }
        else {
            System.out.println("girdiğiniz değer 0 ile 100 arasında olmadığı için değerlendirmeye alınmayacak");
        }

        System.out.println("türkçe notunu giriniz");
        trk=input.nextInt();

        if(trk>0 && trk<100)
        {
            i++;
            havuz=havuz+trk;
        }
        else {
            System.out.println("girdiğiniz değer 0 ile 100 arasında olmadığı için değerlendirmeye alınmayacak");
        }

        System.out.println("kimya notunu giriniz");
        kmy=input.nextInt();

        if(kmy>0 && kmy<100)
        {
            i++;
            havuz=havuz+kmy;
        }
        else {
            System.out.println("girdiğiniz değer 0 ile 100 arasında olmadığı için değerlendirmeye alınmayacak");
        }

        System.out.println("müzik notunu giriniz");
        mzk=input.nextInt();
        if(mzk>0 && mzk<100)
        {
            i++;
            havuz=havuz+mzk;
        }
        else {
            System.out.println("girdiğiniz değer 0 ile 100 arasında olmadığı için değerlendirmeye alınmayacak");
        }

        ort=havuz/i;
        System.out.println("ortalamanız = "+ort);

        if(ort>54)
        {
            System.out.println(i+" dersten ortalama ile geçtiniz");
        }
        else{
            System.out.println(i+" dersten ortalamanız yetmediği için kaldınız");
        }
    }
}
