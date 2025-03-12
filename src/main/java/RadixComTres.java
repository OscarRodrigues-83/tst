package org.example;

import java.util.Arrays;
import java.util.Scanner;

class RadixComTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        int[] numeros = new int[sequencia.length];
        int k = sc.nextInt();
        converteArray(sequencia, numeros);
        radix(numeros, k);
        sc.close();
    }

    public static void radix(int[] v, int n) {
        for (int exp = 1; exp < Math.pow(10, n); exp *= 1000) {
            sort(v, exp);

        }
    }

    public static int[] sort(int[] v, int exp) {
        int[] c = new int[1000];
        int[] arrayOrdenado = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            c[(v[i] / exp) % 1000]++;
        }
        contaFrequencia(c);
        for (int i = v.length - 1; i >= 0; i--) {
            arrayOrdenado[c[(v[i] / exp) % 1000] - 1] = v[i];
            c[v[i] / exp % 1000]--;
        }
        System.out.println(Arrays.toString(arrayOrdenado));
        return arrayOrdenado;
    }

    private static void contaFrequencia(int[] v) {

        for (int i = 1; i < v.length; i++) {
            v[i] += v[i - 1];
        }
    }

    public static void converteArray(String[] tokens, int[] numeros) {
        for (int i = 0; i < tokens.length; ++i) {
            numeros[i] = Integer.parseInt(tokens[i]);
        }
    }

} 