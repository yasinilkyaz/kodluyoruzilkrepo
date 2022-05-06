import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner inp =new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int entry=inp.nextInt();

        
        Arrays.sort(list);
        int min=entry;
        int max=entry;
        for (int i=0;i< list.length;i++){
            System.out.print("dizi sırası = "+i);
            if(entry<list[i]){
                min=list[i-1];
                max=list[i];
                break;
            }

        }
        System.out.println("minimum değer = "+ min);
        System.out.println("maximum değer = "+max);


    }
}