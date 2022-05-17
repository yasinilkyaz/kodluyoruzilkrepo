import java.util.Scanner;

public class MatrisTransPoze {

    static void createMatris(int[][] arr){
        int sayac=0;
        for(int i =0;i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=++sayac;
            }
        }
    }
    static void transPoze(int[][]matris,int[][]transpoze){
        for(int i=0;i< matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                transpoze[j][i]=matris[i][j];
            }
        }
    }
    static void print(int [][]arr){
        for(int []sutun:arr){
            for(int satir:sutun){
                System.out.print(satir+"\t");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int a;
        int b;
        System.out.println("Matrisin Boyutlarını Giriniz (a X b)");
        System.out.println("a:");
        a=inp.nextInt();
        System.out.println("b:");
        b=inp.nextInt();
        int [][]matris=new int[a][b];
        int [][]transpoze=new int[matris[0].length][matris.length];
        createMatris(matris);
        transPoze(matris,transpoze);
        System.out.println("Matris : ");
        print(matris);
        System.out.println();
        System.out.println("Transpoze : ");
        print(transpoze);

    }
}
