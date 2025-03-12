package org.example;

import java.util.Scanner;

public class ChecagemDuplicados {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] seq = sc.nextLine().split(" ");
        int[] numeros = new int[seq.length];
        
        for (int i = 0; i < seq.length; i++) {
            numeros[i] = Integer.parseInt(seq[i]);
        }
        System.out.println(CheckDuplicados(numeros));

        sc.close();
    }

    public static boolean CheckDuplicados(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    return true;
                }
            }
        }
        return false;
    }
   
}
