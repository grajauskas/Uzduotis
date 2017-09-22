package com.company.Uzdaviniai;

import java.util.Scanner;

public class Uzdaviny1 {
    public void vardas() {
        System.out.println("Iveskite varda");
        Scanner scanner = new Scanner(System.in);
        String vardas = scanner.nextLine();
        for(int i = 0 ; i<5; i++){
            System.out.println(vardas);
        }


    }
}
