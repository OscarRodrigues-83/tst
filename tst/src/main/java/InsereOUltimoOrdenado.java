package org.example;

import java.util.Arrays;
import java.util.Scanner;

class InsereOUltimoOrdenado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        int[] numeros =new int[sequencia.length];
        for (int i = 0; i < sequencia.length; i++) {
            numeros[i] = Integer.parseInt(sequencia[i]);
        }
        insereOrdenadoUltimo(numeros);
        System.out.println(Arrays.toString(numeros));

        sc.close();

    }

    private static void insereOrdenadoUltimo(int[] v) {
        for (int i = v.length - 1; i > 0; i--) {
            if (v[i] < v[i - 1]) {
                swap(v, i, i - 1);
            } else {
                break;
            }
        }

    }

    private static void swap(int[] v, int posicao1, int posicao2) {
        int aux = v[posicao1];
        v[posicao1] = v[posicao2];
        v[posicao2] = aux;
    }
    
    
}

