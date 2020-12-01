package com.company;

import java.io.IOException;
import java.util.Scanner;

public class positivos {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        for (int i=0; i < 6; i++) {
            double n = leitor.nextDouble();
            if (n > 0) cont++;
        }
        System.out.println(cont + " valores positivos");
    }
}
