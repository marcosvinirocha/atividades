package com.company;

import java.util.Scanner;

public class gasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         double y = sc.nextDouble();
         double total = 0;

         total = x/y;
         System.out.print(String.format("%.3f",total)+" km/l");
    }
}
