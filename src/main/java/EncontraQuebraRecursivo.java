package org.example;

import java.util.Scanner;

public class EncontraQuebraRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] seq = sc.nextLine().split(" ");
        int[] numeros = new int[seq.length];
        
        for (int i = 0; i < seq.length; i++) {
            numeros[i] = Integer.parseInt(seq[i]);
        }
        System.out.println(QuebraRecursivo(numeros, 0));

        sc.close();
    }  

public static int QuebraRecursivo(int[] v, int ini){
    if(ini == v.length - 1 ) return -1;

    if(v[ini] > v[ini + 1]) return ini + 1;
    
    return QuebraRecursivo(v, ini + 1);

}
}
