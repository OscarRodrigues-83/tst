package org.example;

import java.util.Scanner;

class BuscaBinaria {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] seq = sc.nextLine().split(" ");
        int N = sc.nextInt();
        int[] numeros = new int[seq.length];
        for (int i = 0; i < seq.length; i++) {
            numeros[i] = Integer.parseInt(seq[i]);
        }
        buscar(numeros, 0, numeros.length - 1, N);

        sc.close();
    }

    public static int buscar(int[] v, int ini, int fim, int procurado) {

        int meio = Math.round((fim + ini) / 2) ;

        if (ini > fim) {
            System.out.println(-1);
            return -1;
        }
        if (v[meio] == procurado) {
            System.out.println(meio);
            return meio;

        }

        if (procurado < v[meio]) {
            System.out.println(meio);
            return buscar(v, ini, meio - 1, procurado);
        } else {

            System.out.println(meio);
            return buscar(v, meio + 1, fim, procurado);
        }

    }
}
