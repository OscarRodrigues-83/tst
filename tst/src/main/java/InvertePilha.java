package org.example;

import java.util.*;


class InvertePilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha(sc.nextInt());
        sc.nextLine();
        String[] seq = sc.nextLine().split(" ");
        int[] numeros = new int[seq.length];
        converteArray(seq, numeros);
        pilha.adicionaNaPilha(numeros);
        pilha.invertePilha().imprimeInvertido();
    }

    public static void converteArray(String[] seq, int[] numeros) {
        for (int i = 0; i < seq.length; i++) {
            numeros[i] = Integer.parseInt(seq[i]);
        }
    }

    static class Pilha {
        private int[] pilha;
        private int topo;

        public Pilha(int tamanho) {
            this.pilha = new int[tamanho];
            this.topo = -1;

        }

        public Pilha(int topo, int[] pilhaVelha) {
            this.topo = topo;
            this.pilha = Arrays.copyOfRange(pilhaVelha, 0, pilhaVelha.length);
        }

        public boolean isEmpty() {
            return this.topo == -1;
        }

        public boolean isFull() {
            return this.topo == this.pilha.length - 1;
        }

        public int push(int numero) {
            if (!isFull())
            this.pilha[++this.topo] = numero;
            return this.topo ;
        }

        public int pop() {
            return this.topo--;

        }

        public Pilha invertePilha() {
            
            Pilha novaPilha = new Pilha(this.pilha.length);
            for (int i = 0; i < this.pilha.length; i++) {
                novaPilha.push(this.pilha[pop()]);
            }
            return novaPilha;
        }

        public void imprimeInvertido() {
            while (this.topo > -1) {
                System.out.println(this.pilha[pop() ]);
            }
        }

        public int getTopo() {
            return this.topo;
        }
        public void adicionaNaPilha(int[] num){
           for (int j = 0; j < num.length; j++) {
            push(num[j]);
           }
            
        }
    }

}