package com.company.lecs.Stacks;

public class ResizingArray  {

    private String[] s;

    private int N = 0;

    public ResizingArray() { s = new String[1]; }
    public void push (String item) {
        if (N==s.length) resize(2*s.length);
        s[N++] = item;
    }
    public String pop() {
        String item = s[--N];
        s[N]=null;
        if (N>0 && N==s.length/4) resize(s.length/4);
        return item;
    }
    private void resize(int capacity){
        String[] copy = new String[capacity];
        for (int i = 0; i<N; i++){
            copy[i] = s[i];
        }
        s = copy;
    }

}
