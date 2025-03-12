package org.example;

import java.util.Scanner;


class Maxpilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        Pilha pilha = new Pilha(seq.length);

        int[] numeros = new int[seq.length];
        converteArray(seq, numeros);
        pilha.adicionaNaPilha(numeros);
        System.out.println(pilha.getMax());
    }

    public static void converteArray(String[] seq, int[] numeros) {
        for (int i = 0; i < seq.length; i++) {
            numeros[i] = Integer.parseInt(seq[i]);
        }
    }
}

class Pilha {

    private int topo;
    private int[] pilha;

    public Pilha(int tamanho) {
        this.topo = -1;
        this.pilha = new int[tamanho];
    }

    public int getMax() {
        int maior = this.pilha[pop()];
        while (this.topo > -1) {
            int pretendente = this.pilha[pop()];
            if (pretendente > maior)
                maior = pretendente;
        }
        return maior;
    }

    public boolean isEmpty() {
        return this.topo == -1;
    }

    public void adicionaNaPilha(int[] num) {
        for (int j = 0; j < num.length; j++) {
            push(num[j]);
        }

    }

    public boolean isFull() {
        return this.topo == this.pilha.length - 1;
    }

    public int push(int numero) {
        if (!isFull())
            this.pilha[++this.topo] = numero;
        return this.topo;
    }

    public int pop() {
        return this.topo--;

    }

}