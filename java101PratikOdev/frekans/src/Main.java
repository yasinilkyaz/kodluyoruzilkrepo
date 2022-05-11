import java.util.Arrays;

public class Main
{
    static boolean frekans(int[] arr, int n) {
        boolean[] ziyaret = new boolean[n];
        Arrays.fill(ziyaret, false);

        for (int i = 0; i < n; i++)
        {

            if (ziyaret[i] == true)
                continue;

            int sayac = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ziyaret[j] = true;
                    sayac++;
                }
            }
            if (sayac >= 1) {
                System.out.println(arr[i] + " sayısı " + sayac+" kere tekrar edildi. ");
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int n = list.length;
        System.out.println("----------------------------------------");
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("----------------------------------------");

        System.out.println("Tekrar Sayıları :");
        frekans (list, n);

    }

}