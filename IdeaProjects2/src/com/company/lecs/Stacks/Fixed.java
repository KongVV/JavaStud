package com.company.lecs.Stacks;

public class Fixed {
    private String[] s;
    private int N = 0;

    public Fixed (int capacity) {s = new String[capacity]; }

    public boolean inEmty() {return N==0; }
    public void push (String items) {s[N++] = items; }

    public String pop() {
        String item = s[--N];
        s[N] = null;
        return  item;
    }
}
