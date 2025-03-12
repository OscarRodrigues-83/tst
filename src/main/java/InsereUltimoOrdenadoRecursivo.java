package org.example;

import java.util.Arrays;
import java.util.Scanner;

class InsereUltimoOrdenadoRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" "); 
        int[] numeros = new int[seq.length];
        converteArray(seq, numeros);
        sort(numeros, 0);
        
    }
    public static int[] sort(int[] v, int primeiraPosicao){
        if (primeiraPosicao < v.length - 1 ){
            int j = primeiraPosicao + 1;
            while (j > 0 && v[j] < v[j - 1]) {
                swap(v, j, j -1 );
                j--;
            }
            System.out.println(Arrays.toString(v));
            sort(v, primeiraPosicao + 1);
        }
        
        return v;
    }

    public static void swap (int[] v,int posicao1, int posicao2 ){
     int aux = v[posicao1];
     v[posicao1] = v[posicao2];
     v[posicao2] = aux;
    }

    public static void converteArray(String[] seq, int []numeros){
        for (int i = 0; i < seq.length; i++) {
            numeros[i] = Integer.parseInt(seq[i]);
        }
    }


}

