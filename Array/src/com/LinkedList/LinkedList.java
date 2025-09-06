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

    //add first -> O(1)
    public void addFirst(int data){
        // create new node
        Node newNode = new Node(data);

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
        if(head == null && index ==0){
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
    }
}
