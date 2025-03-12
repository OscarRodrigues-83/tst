package org.example;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] sequencia = sc.nextLine().split(" ");
       int[] numeros = new int[sequencia.length];
       ConverteArray(sequencia, numeros);
       sort(numeros);

       sc.close();

   }
   
   public static void sort(int[]v){
       
       for (int i = 0; i < v.length -1; i++) {
          int indexMenor = i;
           for (int j = i + 1; j < v.length; j++) {
               if (v[j] < v[indexMenor]) indexMenor = j;
           }
           swap(v,i,indexMenor) ;
           if(indexMenor > i)System.out.println(Arrays.toString(v));
       }
       
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
   
}
