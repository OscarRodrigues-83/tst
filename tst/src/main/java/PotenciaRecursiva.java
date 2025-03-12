package org.example;

import java.util.Scanner;

class PotenciaRecursiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(PotRecursiva(i, j));

        sc.close();
    }

    public static int PotRecursiva (int i, int j){
        if (j == 0) return 1 ;
        
       else{
        return i * PotRecursiva(i, j-1);
       }
    }

}
