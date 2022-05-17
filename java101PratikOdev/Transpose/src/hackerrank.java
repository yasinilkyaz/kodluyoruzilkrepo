import java.util.Scanner;

public class hackerrank {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int []arr =new int[a];
        for (int i =0;i<a;i++){
            arr[i]=inp.nextInt();
        }
        int sayac=0;
        for(int j=0;j<a;j++){
            int toplam=0;
            for(int y=j;y<a;y++){
                toplam=arr[y]+toplam;
                if(toplam<0){
                    sayac++;

                }
            }
        }
        System.out.println(sayac);
    }
}
