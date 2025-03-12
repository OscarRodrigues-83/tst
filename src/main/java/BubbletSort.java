package org.example;

import java.util.Scanner;

class BubbletSort {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        int[] numeros = new int[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            numeros[i] = Integer.parseInt(seq[i]);
        }
        int contPrint = 0;
        while (true) {
            int cont = 0;
            for (int i = 0; i < numeros.length - 1; ++i) {
                if (numeros[i] > numeros[i + 1]) {
                    swap(numeros, i);
                    cont++;
                }
            }
            if (cont != 0) {
                System.out.println(FormataArray(numeros));
                contPrint++;
            } else {
                if (contPrint == 0) {
                    System.out.println(FormataArray(numeros));
                }
                break;
            }
        }
        sc.close();

    }

    public static void swap(int[] v, int posicao1) {
        int aux = v[posicao1];
        v[posicao1] = v[posicao1 + 1];
        v[posicao1 + 1] = aux;
    }

    public static String FormataArray(int[] v) {
        String aux = "";
        for (int i = 0; i < v.length; i++) {
            if (i != v.length - 1)
                aux += v[i] + " ";
            else {
                aux += v[i];
            }
        }
        return aux;
    }
}
