package org.example;

import java.util.Arrays;
import java.util.Scanner;

class InsercaoPrimeiroOrdenado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tokens = sc.nextLine().split(" ");

        System.out.println(Arrays.toString(InsertionSort(ConverteArray(tokens))));

        sc.close();
    }

    public static int[] InsertionSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                swap(v, i);
            } else {
                break;
            }
        }
        return v;
    }

    public static int[] ConverteArray(String[] tokens) {
        int[] numeros = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numeros[i] = Integer.parseInt(tokens[i]);
        }
        return numeros;
    }

    public static void swap(int[] v, int posicao1) {
        int aux = v[posicao1];
        v[posicao1] = v[posicao1 +1];
        v[posicao1 + 1] = aux;
    }

}
