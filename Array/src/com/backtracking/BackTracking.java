package com.backtracking;

public class BackTracking {
    public  static void changeArr(int[] arr , int i , int val){
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr , i+1 , val+1); //function call
        arr[i] = arr[i] -2;//back tracking
    }
    public static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr , 0 ,1);
        printArr(arr);
    }
}
