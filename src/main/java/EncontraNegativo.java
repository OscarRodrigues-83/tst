package org.example;

import java.util.Scanner;

class EncontraNegativo {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] seq = sc.nextLine().split(" ");   
        int[] numeros = new int[seq.length];
        boolean achouNegativo = false;

        for(int i = 0; i < seq.length; i++){
            numeros[i] = Integer.parseInt(seq[i]);
        }
    
        for(int i = 0; i < seq.length; i++){
            if(numeros[i] < 0) {
                System.out.println(numeros[i]);
                break;            
            }
        }
if (!achouNegativo) {
    System.out.println(-1);
}        
sc.close();      
    }
}