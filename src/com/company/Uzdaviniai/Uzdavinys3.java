package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys3 {
    public void ivestiSK() {
        System.out.println("Iveskite du skaicius");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("iveskit atra skaiciu");
        int b = scanner.nextInt();
        System.out.println("atsakimas suma");
        System.out.println(a + b);
        System.out.println("atsakimas skirtumas");
        System.out.println(a-b);


    }


}
