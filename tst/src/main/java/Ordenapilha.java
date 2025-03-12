package org.example;

import java.util.Scanner;

public class Ordenapilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        sc.nextLine();
        String[] seq = sc.nextLine().split(" ");
        Pilha pilha = new Pilha(seq.length);

        int[] numeros = new int[seq.length];
        converteArray(seq, numeros);
        pilha.adicionaNaPilha(numeros);
        pilha.ordena();
        System.out.println(pilha.toString());
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

    public void insereOrdenado(int num) {
        if (isEmpty() || this.pilha[topo] >= num) {
            push(num);
        } else {
            int topo = pop();
            insereOrdenado(num);
            push(topo);
        }
    }

    public void ordena() {
        if(!isEmpty()) {
            int topo = pop();
            ordena();
            insereOrdenado(topo);
        }
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

    public String toString() {
        String aux = "";
        while (this.topo > -1) {
            aux += this.pilha[pop()];
        }
        return aux;
    }

    public int pop() {
        return this.pilha[this.topo--];

    }

}
