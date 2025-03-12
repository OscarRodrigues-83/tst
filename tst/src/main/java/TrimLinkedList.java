package org.example;

import java.util.Scanner;

 class TrimLinkedList {
    public static void main(String[] args) {
        LinkedList novaLista = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String[] sequencia = sc.nextLine().split(" ");
        converteArray(sequencia, novaLista);
       System.out.println(novaLista.trim(sc.nextInt()));
        sc.close();

    }

    public static void converteArray(String[] tokens, LinkedList ll) {
        for (int i = 0; i < tokens.length; ++i) {
            ll.addLast(Integer.parseInt(tokens[i]));
        }
    }

}

class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public String trim(int quantBordas) {
        String aux = "";
        if (quantBordas * 2 >= this.size) {
            aux += "vazia";
        } else {
           int i = quantBordas;
            while (i > 0) {
                
                Node n1 = this.head.next;
                Node n2 = this.tail.prev;

                n1.prev = null;
                this.head = n1;
                n2.next = null;
                this.tail = n2;
                i--;

            }
            aux += toString();
        }
        return aux;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addLast(int valor) {
        Node novoNode = new Node(valor);
        if (isEmpty()) {
            this.head = novoNode;
            this.tail = novoNode;
        } else {
            this.tail.next = novoNode;
            novoNode.prev = this.tail;
            this.tail = novoNode;
        }
        this.size++;

    }

    public String toString() {
        if (isEmpty())
            return "";

        Node aux = this.head;
        String out = "";
        while (aux != null) {
            out += aux.value;
            if (aux == tail)
                break;
            out += " ";
            aux = aux.next;
        }
        return out.trim();
    }

    public int size() {
        return this.size;
    }

    void swapVizinhos(int index) {
        if (size < 2 || index < 0 || index >= size - 1)
            return;

        Node n1 = findElement(index);
        Node n2 = n1.next;

        Node prev1 = n1.prev;
        Node next1 = n1.next;
        Node prev2 = n2.prev;
        Node next2 = n2.next;

        n1.prev = n2;
        n2.next = n1;
        if (prev1 == null)
            this.head = n2;
        else
            prev1.next = n2;
        if (next2 != null)
            next2.prev = n1;
        else {
            this.tail = n1;
        }

        n1.next = next2;
        n2.prev = prev1;

    }

    void inverte() {

    }

    public Node findElement(int index) {
        Node aux = head;
        for (int i = 0; i < index; i++)
            aux = aux.next;
        return aux;
    }

}

class Node {

    int value;
    Node prev;
    Node next;

    Node(int v) {
        this.value = v;
    }

}
