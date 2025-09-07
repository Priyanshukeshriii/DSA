package com.Stack;

import java.util.*;

public class StackUsingJavaCollectionFrameWrok {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
