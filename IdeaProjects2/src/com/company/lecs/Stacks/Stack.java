package com.company.lecs.Stacks;

import java.util.NoSuchElementException;

public class Stack<Item> {
    private Node first = null;
    int size = 0;

    private class  Node {
        Item item;
        Node next;
    }
    public  Item peek() {
        if (isEmty()) throw new NoSuchElementException("Stack underflow");
        return  first.item;
    }

    public void push (String item) {
        size++;
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }
    public  Item pop() {

            size--;
            Item item = first.item;
            first = first.next;
            return item;
    }
    boolean isEmty() {return first == null; }
}

