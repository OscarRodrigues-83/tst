package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        int[] numeros = new int[sequencia.length];
        ConverteArray(sequencia, numeros);
        sort(numeros, 0, numeros.length - 1);
        sc.close();

    }
    public static void sort (int[] v, int ini, int fim){
        if(ini < fim){
        int middle = (ini +fim) / 2;
        System.out.println(Arrays.toString(Arrays.copyOfRange(v, ini, fim + 1)));
    
         sort(v, ini, middle);

            sort(v, middle + 1, fim);
            merge(v, ini, middle, fim);
            System.out.println(Arrays.toString(Arrays.copyOfRange(v, ini, fim + 1)));
        }else{
            System.out.println(Arrays.toString(Arrays.copyOfRange(v, ini, fim + 1)));
        }
    }
    public static int merge (int[] v, int ini, int middle, int fim){

        int[] helper = new int[v.length];
        for (int i = 0; i < helper.length; i++) {
            helper[i] = v[i];
        }

        int k = ini;
        int i = ini;
        int j = middle + 1;

        while (i <= middle && j <= fim){

            if(helper[i] <= helper[j]){
                v[k++] = helper[i++];
            }
            else{
                v[k++] = helper[j++];
            }
        }
        while(i <= middle){
            v[k++] = helper[i++];
        }
        return middle;
    }
    public static void ConverteArray(String[] tokens, int[] numeros) {
        for (int i = 0; i < tokens.length; ++i) {
            numeros[i] = Integer.parseInt(tokens[i]);
        }

    }
}
