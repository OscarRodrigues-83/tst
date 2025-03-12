package org.example;

import java.util.Scanner;

public class LinearRecursiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        int[] numeros = new int[seq.length];
        int procurado = sc.nextInt();
        for (int i = 0; i < seq.length; i++) {
            numeros[i] = Integer.parseInt(seq[i]);
        }

        System.out.println(BuscaLinearRecursiva(numeros, 0, procurado));

        sc.close();

    }

    public static int BuscaLinearRecursiva(int[] v, int index, int procurado) {
        if (index >= v.length)
            return -1;

        if (v[index] == procurado)
            return index;

        return BuscaLinearRecursiva(v, index + 1, procurado);
    }
}
