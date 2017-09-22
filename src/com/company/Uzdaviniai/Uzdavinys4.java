package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys4 {
    public void skirtingiMET() {
        System.out.println("Iveskite skaiciu");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("iveskit antra skaiciu");
        int b = scanner.nextInt();
        System.out.println("atsakimas suma");
        System.out.println(suma(a, b));
        System.out.println("atsakimas skirtumas");
        System.out.println(skirtumas(a, b));


    }

    public int skirtumas(int x, int y) {
        return x - y;

    }

    public int suma(int x, int y) {
        return x + y;

    }
}
