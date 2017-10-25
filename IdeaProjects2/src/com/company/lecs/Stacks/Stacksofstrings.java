package com.company.lecs.Stacks;

public class Stacksofstrings {

    private  Node first = null;
    int size = 0;
    private class  Node {
        String item;
        Node next;
    }

    public void push (String item) {
        size ++;
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }
    public  String pop() {
        if (!isEmty()) {
            size--;
            String item = first.item;
            first = first.next;
            return item;
        }
        return "";
    }
    boolean isEmty() {return first == null; }
}
