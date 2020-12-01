package com.company;

import java.util.Scanner;

public class pares {
    public static void main(String args[]){
        int contador = 0;
        int numero = 0;

        // Scanner le o numero e passa como um inteiiro

        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        // contador recebe os numeros com resto da divisão e imprimi

        while (contador < numero) {
            contador++;
            if (contador % 2 == 0)
                System.out.println(contador);

        }
    }
}



