package Materia.models;

public class Node {
     int value;
     Node next;

     public int getValue() {
        return value;
    }

     public void setValue(int value) {
         this.value = value;
     }

     public Node getNext() {
         return next;
     }

     public void setNext(Node next) {
         this.next = next;
     }

     public Node (int value){
        this.value = value;
        this.next = null;
     }

     @Override
    public String toString() {
        return "Node [value=" + value + ", next=" + next + "]";
    }
}