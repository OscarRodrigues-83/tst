package org.example;

import java.util.Arrays;
import java.util.Scanner;

class RadixSort {

    public RadixSort(){}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        int[] numeros = new int[sequencia.length];
        int k = sc.nextInt();
        ConverteArray(sequencia, numeros);
        radix(numeros, k);
        sc.close();

    }

    private static void radix(int[] v, int n) {
        for (int exp = 1; exp < Math.pow(10, n); exp *= 10) {
            sort(v, exp);
        }
    }

    private static void sort(int[] v, int exp) {
        int[] c = new int[10];
        int[] arrayOrdenado = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            c[(v[i] / exp) % 10]++;
        }
        contaFrequencia(c);
        for (int i = v.length - 1; i >= 0; i--) {
            arrayOrdenado[c[(v[i] / exp) % 10] - 1] = v[i];
            c[(v[i] / exp) % 10]--;
        }
        System.arraycopy(arrayOrdenado, 0, v, 0, v.length);
        System.out.println(Arrays.toString(v));
    }

    private static void contaFrequencia(int[] v) {

        for (int i = 1; i < v.length; i++) {
            v[i] += v[i - 1];
        }
    }

    public static void ConverteArray(String[] tokens, int[] numeros) {
        for (int i = 0; i < tokens.length; ++i) {
            numeros[i] = Integer.parseInt(tokens[i]);
        }
    }
}
