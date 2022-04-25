import java.util.Scanner;

public class PalindromSayilar {
    static boolean palindrom(int a){
        String sayi=Integer.toString(a);
        String d="";
        for(int i =sayi.length()-1;i>-1;i--)
            d+=sayi.charAt(i);
            int f=Integer.parseInt(d);
            if(f==a){
                return true;

            }

        return false;
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("sayı : ");
        int l=inp.nextInt();
        String se="";
        boolean pal=palindrom(l);
        if(pal){
            se=l+" sayı Palindromdur";
        }
        else {
            se=l+" sayı Palindrom değildir";
        }
        System.out.println(se);
    }
}
