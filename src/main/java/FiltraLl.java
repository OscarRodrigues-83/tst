package org.example;

import java.util.Scanner;

class FiltraLl {
    public static void main(String[] args) {
        LinkedList novaLista = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        converteArray(sequencia, novaLista);
        novaLista.filtra(sc.nextInt());
        System.out.println(novaLista.toString());
        sc.close();
    }

    public static void converteArray(String[] tokens, LinkedList ll) {
        for (int i = 0; i < tokens.length; ++i) {
            ll.addLast(Integer.parseInt(tokens[i]));
        }
    }

    public static class LinkedList {
        private Node tail;
        private Node head;
        private int size;

        public LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void filtra(int num) {
            Node aux = this.head;

            int cont = 0;
            for (int i = 0; i < size; i++) {
                Node prevAux = aux.prev;
                Node nextAux = aux.next;
                if (aux.valor == num && aux.prev == null && aux.next == null) {
                    cont++;
                    this.head = null;
                    this.tail = null;
                    this.size = this.size - cont;
                    return;
                }
                if (aux.valor == num) {
                    cont++;
                    if (prevAux != null) {
                        prevAux.next = nextAux;
                    } else {
                        this.head = nextAux;
                        nextAux.prev = null;
                    }
                    if (nextAux != null) {
                        nextAux.prev = prevAux;
                    } else {
                        this.tail = prevAux;
                        this.tail.next = null;

                    }
                }
                aux = aux.next;
            }
            this.size = size - cont;

        }

        public void addLast(int valor) {
            Node aux = new Node(valor);

            if (this.size == 0) {
                this.head = aux;
                this.tail = aux;
            } else {
                this.tail.next = aux;
                aux.prev = this.tail;
                this.tail = aux;
            }
            this.size++;
        }

        public Node findNode(int index) {
            Node aux = this.head;
            for (int i = 0; i < index; i++) {
                aux = aux.next;
            }
            return aux;
        }

        public String toString() {
            if (this.size == 0)
                return "vazia";

            Node aux = this.head;
            String out = "";
            while (aux != null) {
                out += aux.valor;
                if (aux == tail)
                    break;
                out += " ";
                aux = aux.next;
            }
            return out;
        }

        class Node {

            private int valor;
            private Node next;
            private Node prev;

            public Node(int valor) {
                this.valor = valor;
            }

        }
    }
}