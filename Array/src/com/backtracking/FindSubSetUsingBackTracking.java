package com.backtracking;

public class FindSubSetUsingBackTracking {
    public static void findSubSet(String str , String subSet, int i){
        // Time Complexity is O(n*2^n)
        //base case
        if(i == str.length() ){
            if(subSet.length() == 0 ){
                System.out.println("null");
            }else {
                System.out.println(subSet);
            }
            return;
        }
        //Yes choice
        findSubSet(str, subSet+str.charAt(i) , i+1);
        //No choice
        findSubSet(str,  subSet ,  i+1);
    }

    public static void main(String[] args) {
        String ans ="";
        findSubSet("abc" ,ans , 0 );
    }
}
