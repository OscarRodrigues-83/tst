package org.example;

import java.util.Scanner;

public class FrequenciaElemento {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alvo = sc.nextInt();
        sc.nextLine();
        String[] seq = sc.nextLine().split(" ");
        int[] numeros = new int[seq.length];

        for (int i = 0; i < seq.length; ++i) {
            numeros[i] = Integer.parseInt(seq[i]);
        }
        System.out.println(AchaFrequencia(numeros, alvo));

        sc.close();

    }

    public static int AchaFrequencia(int[] v, int alvo) {
        int freq = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == alvo)
                freq++;
        }
        return freq;
    }

}