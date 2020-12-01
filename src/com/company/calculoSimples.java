package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class calculoSimples {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        double c1 =sc.nextDouble();

        double res = 0;

        res = (b*c)+(b1*c1);

        System.out.println(String.format("VALOR A PAGAR = R$ %.2f",res));


    }
}
