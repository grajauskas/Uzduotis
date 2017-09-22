package com.company;

import com.company.Uzdaviniai.*;

import java.util.Scanner;

public class Main {
    public static final int UZDAVINYS_0 = 0;
    public static final int UZDAVINYS_1 = 1;
    public static final int UZDAVINYS_2 = 2;
    public static final int UZDAVINYS_3 = 3;
    public static final int UZDAVINYS_4 = 4;
    public static final int UZDAVINYS_5 = 5;

    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        while (true) {
            System.out.println("Pasirinkite uždavinį kurį norite pamatyti");
            System.out.println("Įvedus -1 programa bus baigta");
            int uzdavinioNumeris = skaitytuvas.nextInt();
            switch (uzdavinioNumeris) {
                case UZDAVINYS_0:
                    Uzdavinys0 uzdavinys0 = new Uzdavinys0();
                    uzdavinys0.pasisveikink();
                    break;


                case UZDAVINYS_1:
                    Uzdaviny1 uzdavinys1 = new Uzdaviny1();
                    uzdavinys1.vardas();
                    break;

                case UZDAVINYS_2:
                    Uzdavinys2 uzdavinys2 = new Uzdavinys2();
                    uzdavinys2.ivestiZodi();
                    break;

                case UZDAVINYS_3:
                    Uzdavinys3 uzdavinys3 = new Uzdavinys3();
                    uzdavinys3.ivestiSK();
                    break;


                case UZDAVINYS_4:
                    Uzdavinys4 uzdavinys4 = new Uzdavinys4();
                    uzdavinys4.skirtingiMET();
                    break;

                case UZDAVINYS_5:
                    Uzdavinys5 uzdavinys5 = new Uzdavinys5();
                    uzdavinys5.skirtingiMET();
                    break;



                default:
                    return;

            }
        }
    }
}

