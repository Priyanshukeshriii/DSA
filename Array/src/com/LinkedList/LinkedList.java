package com.LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add first -> O(1)
    public void addFirst(int data){
        // create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        // newNode next = head
        newNode.next = head;//linking process

        //pointing the head to newly created node
        head = newNode;
    }

    //add last -> O(1)
    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //changing the reference of last node
        tail.next = newNode;

        //updating the tail Node
        tail = newNode;

    }
    //add in the middle
    public void add(int index , int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        size++;
        if(head == null ){
            Node newNode = new Node(data);
            head = tail = newNode;
            return;
        }else if (head == null && index !=0){
            System.out.println("The index is not persent");
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        // finding the index
        while(i < index-1){
            temp = temp.next;
            i++;
        }

        //changing the reference of the nodes
        newNode.next = temp.next;
        temp.next= newNode;

    }

    //removing the value from first
    public int removeFirst(){
        //checking if linked list is empty
        if(size == 0){
            System.out.println("The linked list is empty");
            return Integer.MIN_VALUE;
        }
        //checking the condition when the size of linked list is 1;
        if(size ==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //storing the value of head
        int val = head.data;
        //updating the reference of the head
        head = head.next;
         size--;
        return val;
    }

    //removing the last element
    public int removeLast(){
        if(size == 0){
            System.out.println("The Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = tail.data;
        Node prev  = head;
        //find the previous node
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        //updating the tail
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // finding the index of key
    //O(n)
    public int itrSearch(int key){
        int i =0;
        Node temp = head;
        while(temp != null){
            //key found
            if(key == temp.data){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //finding the index of the key using recursion
    public int helper(Node head, int key){
        //checking if the linked list is empty or not
        if(head == null){
            return -1;
        }
        //if key found return 0
        if(head.data == key ){
            return 0;
        }

        int index = helper(head.next , key);
        //cheching if the upper level have found the key or not if not return -1
        if(index == -1){
            return -1;
        }
        //else return index + 1
        return index+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    //reverse a linked list
    public void reverse(){
        if(head == null){
            System.out.println("The Linked List is empty");
            return;
        }
        if(size == 1){
            return;
        }
        Node current = tail = head;
        Node next ;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Print the Linked List
    public void printLinkedList(){
        //checking the Linked List is empty or not
        if(head == null){
            System.out.println("The Linked List is empty");
        }
        //created a temp reference
        Node temp = head;
        //printing the value till temp becomes null
        while (temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        //printing null
        if(temp == null){
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3 );
        ll.printLinkedList();
        ll.add(2,67);
        ll.printLinkedList();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.printLinkedList();
        System.out.println(ll.removeLast());
        ll.printLinkedList();
        System.out.println(ll.itrSearch(67));
        System.out.println(ll.recSearch(67));
        ll.reverse();
        ll.printLinkedList();
    }
}
