package org.example;

import java.util.Scanner;

class TeoremaMestre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] seq = sc.nextLine().split(" ");
        int[] numeros = new int[seq.length];

        for (int i = 0; i < seq.length; i++) {
            numeros[i] = Integer.parseInt(seq[i]);
        }

        CalculaTeoremaMestre(numeros[0], numeros[1], numeros[2]);
        sc.close();
    }

    public static void CalculaTeoremaMestre(int a, int b, int c) {
        double n = Math.log(a) / Math.log(b);
        if (n > c)
            System.out.println("T(n) = theta(n**" + (int)n + ")");

        if ((Math.round(n) == c))
            System.out.println("T(n) = theta(n**" + (int) n + ") " + "* log n");

        if (n < c)
            System.out.println("T(n) = theta(n**" + c + ")");
        

    }
}
