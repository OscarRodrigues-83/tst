package org.example;

import java.util.Scanner;

class RemoveIndexLL {

    public static void main(String[] args) {
        LinkedList novaLista = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        converteArray(sequencia, novaLista);
        novaLista.remove(sc.nextInt());
        System.out.println(novaLista);
        sc.close();
    }
    
    public static void converteArray(String[] tokens, LinkedList ll) {
        for (int i = 0; i < tokens.length; ++i) {
            ll.addLast(Integer.parseInt(tokens[i]));
        }
}
    public static class  LinkedList {
        private Node tail;
        private Node head;
        private int size;

        public LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void remove(int index) {
            if (this.size == 1) {
                this.head = null;
                this.tail = null;
                this.size--;
                return;
            }
            Node aux = findNode(index);
            Node prevAux = aux.prev;
            Node nextAux = aux.next;

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
            this.size--;
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
                return "";

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