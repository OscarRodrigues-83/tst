package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class ElementoSobrando {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vString = sc.nextLine().split(" ");
        String[] kString = sc.nextLine().split(" ");
        PegaElemenento(converteArray(vString), converteArray(kString));

        sc.close();
    }

    public static void PegaElemenento(int[] v, int[] k) {
        HashSet<Integer> numeros = new HashSet<>();

        for (Integer num : v) {
            numeros.add(num);
        }
        for (Integer num : k) {
            if (numeros.add(num))
                System.out.println(num);
        }
    }

    public static int[] converteArray(String[] tokens) {
        int[] numeros = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numeros[i] = Integer.parseInt(tokens[i]);
        }
        return numeros;
    }
}
