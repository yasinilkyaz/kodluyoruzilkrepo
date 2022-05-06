package array;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizi uzunlugu: ");
        int n=inp.nextInt();
        int[] list= new int[n];
        for(int i=0; i<list.length; i++){
            System.out.print((i+1)+". eleman: ");
            list[i]=inp.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Siralama: "+Arrays.toString(list));
    }
}