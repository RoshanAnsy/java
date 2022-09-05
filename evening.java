import java.util.*;
public class evening {
    Node head;
    private int size;
    evening(){
        size=0;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
public void addFirst(int val){
    Node newNode=new Node(val);
    if(head==null){
        newnode.next=head;
        return;
    }
    head=newNode;
}
public void printinfo(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
    }
    System.out.print("null");
}

     public static void main(String[] args) {
        evening list=new evening ();
        list.addFirst(1);
        list.addFirst(2);
        list.printinfo();
    }
}
