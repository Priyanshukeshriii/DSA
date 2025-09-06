package com.backtracking;

public class PermutationUsingBackTracking {
    public static void findPermutation(String str , String ans){
        // Base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion - O(n*n!)
        for (int i = 0 ; i<str.length() ;i++){
            char currentch  = str.charAt(i);
            //"abcd" => "ab" +"d"
            String newStr = str.substring(0, i)+ str.substring(i+1 );
            findPermutation(newStr , ans+currentch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans ="";
        findPermutation(str , ans);
    }

}
