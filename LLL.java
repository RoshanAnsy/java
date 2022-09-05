import java.util.*;
public class LLL {
    Node head;
    private int size;
    LLL(){
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
    public void addLast(Node head,int val){
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
public void addFirst(Node head,int val){
    Node newNode=new Node(val);
    if(head==null){
        newNode.next=head;
        return;
    }
    head=newNode;
}
public void printinfo(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
    }
    System.out.print("null");
}

     public static void main(String[] args) {
        LLL list=new LLL (NULL);
        list.addFirst(list,1);
        list.addFirst(list,2);
        list.printinfo(list);
    }
}
