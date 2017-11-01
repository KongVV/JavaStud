package com.company;

import com.company.lecs.Stacks.Fixed;
import com.company.lecs.Stacks.Stack;
import com.company.lecs.Stacks.Stacksofstrings;
import jdk.nashorn.api.tree.WhileLoopTree;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Main {
    private static void inOut(Scanner in, PrintStream out){
        while(in.hasNext()){
            out.println(in.next());
        }
    }

    private  static void stack(Scanner in, PrintStream out){
         Fixed stack = new Fixed(10);
        while (in.hasNext()) {
            String s = in.next();
            if ((s.equals("-"))) {
                out.print(stack.pop() + " ");
            } else  {
                stack.push(s);
            }
        }
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        stack(in,out);
    }
}
