package Linked_List;

import java.util.Random;

public class LinkedList {
    private Node head;
    public int size = 0;

    public void display() {
        Node temp = head;

        for (int i = 0; i < size; i++) {
            if (i % 12 == 0) {
                System.out.print("\n");
            }
            temp.display();
            temp = temp.getNext();
            System.out.print(", ");
        }
    }
    public void addToFront(String x){  // dont really use this
        Node temp = new Node(x);
        temp.setNext(head);
        head = temp;
    }
    public void add(String x){
        size++; // counter for the location
        Node user = new Node(x);  // turing the string into a node

        if(head == null){ // conditon if the list is empty
            head = user;
        }
        else if (x.compareTo(head.getValue()) <= 0) { // if the new word is smaller
            user.setNext(head);
            head = user;
        }
        else if (x.compareTo(head.getValue()) > 0) { // if new word is greater
            Node cur = head;
            Node prev = head;

            while (x.compareTo(cur.getValue()) > 0) { // placing them alphabetically in  between
                prev = cur;
                cur = cur.getNext();
                if (cur == null) {
                    user.setNext(prev.getNext());
                    break;
                }
            }
            if(cur != null){
                user.setNext(cur);
            }
            prev.setNext(user);
        }
        else{
            user.setNext(head);
            head = user;
        }
    }
    public int find(String s){
        Node temp = head;
        int count = 1;
        while(temp != null) {
            if(temp.getValue().compareTo(s) ==0){
                return count;
            }
            else{
                temp = temp.getNext();
                count++;
            }
        }
        return 0;
    }
    public void delete() {
        Random rand = new Random();
        int num = rand.nextInt(size);
        size--;
        Node current = head;
        Node prev = current;

        int spot = 0;
        String valueOut = "";
        if (num == 0) {
            valueOut = head.getValue();
            head = head.getNext();
        } else {
            while(spot < num) {
                prev = current;
                current = current.getNext();
                spot++;
                valueOut = current.getValue();
            }
            prev.setNext(current.getNext());
        }
        System.out.printf("%s was removed from location %d", valueOut, num + 1);
    }
}