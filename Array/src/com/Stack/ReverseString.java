package com.Stack;
import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s =new Stack<>();
        int index =0;
        while (index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder ans = new StringBuilder("");
        while (!s.isEmpty()){
            char ch = s.pop();
            ans.append(ch);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
