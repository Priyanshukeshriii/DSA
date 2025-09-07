package com.Stack;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] stocks = {100, 80 , 60 , 70, 60,85,100};
        int[] span = new int[stocks.length];
        stockSpan(stocks , span);
        for (int sp : span){
            System.out.println(sp +" ");
        }
    }

    private static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] =1;
        s.push(1);
        for (int i = 0; i < stocks.length; i++) {
            int currentPrice = stocks[i];
            while (!s.isEmpty() && currentPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else {
                int prevHigh =s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
}
