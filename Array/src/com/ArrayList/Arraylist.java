package com.ArrayList;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        // add element -O(1)
        list.add(30);
        list.add(300);
        list.add(3000);
        System.out.println(list);
        //other adding element - O(n)
        list.add(2,1);
        System.out.println(list);

        //get Operation - O(1)
        int element = list.get(1);
        System.out.println(element);

        //remove element O(n)
        int removedElement = list.remove(1);
        System.out.println(removedElement);

        //set element at any index
        list.set(0,80);
        System.out.println(list);

        //contains
        System.out.println(list.contains(11));
        System.out.println(list.contains(80));
    }
}
