package org.example;
import java.util.Arrays;
import java.util.Scanner;

class Hoare {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] sequencia = sc.nextLine().split(" ");
       int[] numeros = new int[sequencia.length];
       ConverteArray(sequencia, numeros);
       particiona(numeros, 0, numeros.length - 1);
       System.out.println(Arrays.toString(numeros));
       sc.close();

   }
   public static int particiona(int[] v, int ini, int fim){
       int pivot = v[ini];
       int i = ini + 1;
       int j = fim ;
       while (i <= j) {
           
       while(i <= j && v[i] <= pivot) i++;    
       while(j >= i && v[j] > pivot) j--;    
       
       if(i <= j)swap(v, i, j);
       }
      swap(v,ini,j);
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

}