package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int gun,ay;
    Scanner input=new Scanner(System.in);
        System.out.println("gün giriniz");
        gun=input.nextInt();

        System.out.println("ay giriniz");
        ay=input.nextInt();
        if(gun>31)
        {
            System.out.println("girilen gün hatalı");
        }
        if(ay>12)
        {
            System.out.println("girilen ay hatalı");
        }
        if(ay==1&&gun<22)
        {
            System.out.println("oğlak");
        }
        else if(ay==1&&gun>21)
        {
            System.out.println("kova");
        }

        if(ay==2&&gun<20)
        {
            System.out.println("kova");
        }
        else if(ay==2&&gun>21)
        {
            System.out.println("balık");
        }
        if(ay==3&&gun<21)
        {
            System.out.println("balık");
        }
        else if(ay==3&&gun>21)
        {
            System.out.println("koç");
        }
        if(ay==4&&gun<21)
        {
            System.out.println("koç");
        }
        else if(ay==4&&gun>20)
        {
            System.out.println("boğa");
        }
        if(ay==5&&gun<22)
        {
            System.out.println("boğa");
        }
        else if(ay==5&&gun>21)
        {
            System.out.println("ikizler");
        }
        if(ay==6&&gun<23)
        {
            System.out.println("ikizler");
        }
        else if(ay==6&&gun>22)
        {
            System.out.println("yengeç");
        }
        if(ay==7&&gun<23)
        {
            System.out.println("yengeç");
        }
        else if(ay==7&&gun>22)
        {
            System.out.println("aslan");
        }
        if(ay==8&&gun<23)
        {
            System.out.println("aslan");
        }
        else if(ay==8&&gun>22)
        {
            System.out.println("başak");
        }
        if(ay==9&&gun<23)
        {
            System.out.println("başak");
        }
        else if(ay==9&&gun>22)
        {
            System.out.println("terazi");
        }
        if(ay==10&&gun<23)
        {
            System.out.println("terazi");
        }
        else if(ay==10&&gun>22)
        {
            System.out.println("akrep");
        }
        if(ay==11&&gun<23)
        {
            System.out.println("akrep");
        }
        else if(ay==11&&gun>22)
        {
            System.out.println("yay");
        }
        if(ay==12&&gun<23)
        {
            System.out.println("yay");
        }
        else if(ay==12&&gun>22)
        {
            System.out.println("oğlak");
        }

    }
}
