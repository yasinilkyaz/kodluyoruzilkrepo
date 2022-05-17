import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int satir, sutun, mayinNumarasi;

    String[][] mayin;
    String[][] kopya;

    MineSweeper(int satir, int sutun) {
        this.satir = satir;
        this.sutun = sutun;
        this.mayin = new String[satir][sutun];
        this.kopya = new String[satir][sutun];

    }

    void run() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kolay : " + (int) (satir * sutun * 0.1) + "\n" +
                "Orta : " + (int) (satir * sutun * 0.15) + "\n" +
                "Zor : " + (int) (satir * sutun * 0.2) + "\n" +
                "Mayın Sayısını Giriniz : ");
        this.mayinNumarasi = inp.nextInt();
        mayinAlani(mayinNumarasi);
        System.out.println("------------Hoşgeldiniz------------");
        print(this.kopya);
        while (true) {
            System.out.print("Lütfen satır sayısı giriniz = ");
            int satir = inp.nextInt();
            System.out.print("Lütfen sutun sayısı giriniz = ");
            int sutun = inp.nextInt();
            System.out.println("===========================");
            if (satir >= this.satir || sutun >= this.sutun) {
                System.out.println("yanlış giriş yaptınız");
                print(this.kopya);
                continue;
            }
            if (this.mayin[satir][sutun].equals("*")) {
                print(this.mayin);
                System.out.println("--Kaybettiniz--");
                break;
            } else {
                this.kopya[satir][satir] = this.mayin[satir][sutun];
                print(this.kopya);
            }
            if (win()) {
                System.out.println("tebrikler kazandınız");
                break;
            }
            continue;
        }
    }

    void mayinAlani(int mayinNumarasi) {
        int alan = 0;
        while (alan < mayinNumarasi) {
            int rdSatir = (int) (Math.random() * this.satir);
            int rdSutun = (int) (Math.random() * this.sutun);
            if (mayin[rdSatir][rdSutun] == null) {
                mayin[rdSatir][rdSutun] = "*";
                alan++;
            }
        }
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (this.mayin[i][j] == null) {
                    this.mayin[i][j] = mayinSayici(i, j);
                }
            }

        }
        for (String[] arr : this.kopya) {
            Arrays.fill(arr, "-");
        }
    }

    String mayinSayici(int satir, int sutun) {
        int sayac = 0;
        for (int i = satir - 1; i < satir + 2; i++) {
            for (int j = sutun - 1; j < sutun + 2; j++) {
                if (i >= 0 && i < this.satir && j >= 0 && j < this.sutun) {
                    if (this.mayin[i][j] == null) {
                        continue;
                    } else if (this.mayin[i][j].equals("*")) {
                        sayac++;
                    }
                }
            }
        }
    return String.valueOf(sayac);
    }

    boolean win() {
        int sayac = 0;

        for (String[] satir : this.kopya) {
            for (String mayin : satir) {
                if (mayin.equals("-")) {
                    sayac++;
                }
            }
        }
        return sayac == this.mayinNumarasi;
    }

    void print(String[][] field) {

        for (int i = 0; i < this.satir; i++) {
            for (int j = 0; j < this.sutun; j++) {
                System.out.print(field[i][j] + " ");

            }
            System.out.println();
        }
    }

}
