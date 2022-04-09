package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String kullanici,sifre,yeniSifre;
        int i;
        sifre="123";
        Scanner input=new Scanner(System.in);
        System.out.println("kullanıcı adını giriniz");
        kullanici=input.nextLine();
        System.out.println("şifre girin");
        sifre=input.nextLine();

        if(kullanici.equals("yasin")&&sifre.equals("123")){
            System.out.println("giriş yapıldı");

        }
        else if(kullanici.equals("yasin")&&!sifre.equals("123")){
            System.out.println("şifre hatalı");
            System.out.println("sifrenizi sıfırlamak istiyomusunuz \n evet 1 \n hayır 2");
            i=input.nextInt();
            switch (i){
                case 1:
                    System.out.println("yeni şifreyi giriniz");
                    System.out.println("yeni şifreniz"+input.nextLine());
                    yeniSifre=input.nextLine();
                    if(yeniSifre.equals(sifre))
                    {
                        System.out.println("eski şifre ile yeni şifre aynı olamaz");
                    }
                    else {
                        System.out.println("şifreniz başarıyla değiştirildi");
                    }
                    break;
                case 2:
                    System.out.println("şifreniz değiştirilme iptal edildi");
                    break;
            }

        }

    }
}
