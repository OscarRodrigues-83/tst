package org.example;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        int[] numeros = new int[sequencia.length];
        ConverteArray(sequencia, numeros);
        sort(numeros, 0, numeros.length - 1);

        sc.close();

    }

    public static void sort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int indexPivot = particiona(v, ini, fim);
            sort(v, ini, indexPivot - 1);
            sort(v, indexPivot + 1, fim);

        }
    }

    public static int particiona(int[] v, int ini, int fim) {
        int pivot = v[ini];
        int i = ini + 1;
        int j = fim;

        while (i <= j) {

            while (i <= j && v[i] < pivot)
                i++;

            while (j > ini && v[j] > pivot)
                j--;

            if (i <= j)
                swap(v, i, j);
        }

        swap(v, ini, j);
        imprimeArray(v);
        return j;
    }

    public static void swap(int[] v, int posicao1, int posicao2) {
        int aux = v[posicao1];
        v[posicao1] = v[posicao2];
        v[posicao2] = aux;
    }

    public static void ConverteArray(String[] tokens, int[] numeros) {
        for (int i = 0; i < tokens.length; ++i) {
            numeros[i] = Integer.parseInt(tokens[i]);
        }

    }
    public static void imprimeArray(int[] v){
        String aux = "";
        for (int i = 0; i < v.length; i++) {
            if(i < v.length - 1){
                aux += String.valueOf(v[i] + " ");
            }
            else{
                aux += String.valueOf(v[i]);
            }
        }
        System.out.println(aux);
    }
}
