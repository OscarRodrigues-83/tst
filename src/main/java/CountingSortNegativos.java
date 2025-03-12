package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortNegativos {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        int[] numeros = new int[sequencia.length];
        int k = sc.nextInt();
        int menor = sc.nextInt();
        ConverteArray(sequencia, numeros);
        sort(numeros, k);
        // System.out.println(Arrays.toString(sort(numeros, k)));
        sc.close();

    }

    public static int[] sort(int[] v, int k) {
        int[] c = new int[k - getMenor(v) + 1];
        int[] arrayOrdenado = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            c[v[i] - getMenor(v) ]++;
            System.out.println(Arrays.toString(c));
        }
        contaFrequencia(c);
        System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(c));

        for (int i = v.length - 1; i >= 0; i--) {
            arrayOrdenado[c[v[i] - getMenor(v)] - 1] = v[i];
            c[v[i] - getMenor(v) ]--;
        }
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(arrayOrdenado));

       
        return arrayOrdenado;
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

    private static int getMenor(int a[]) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < menor)
                menor = a[i];
        }
        return menor;
    }
}
