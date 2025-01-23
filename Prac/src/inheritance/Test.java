package inheritance;

import linkedlist.Node;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
//        BoxChild bp = new BoxPrice(1,2,3,4 ,5);
//        System.out.println(bp.toString());

        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);
        Node l5 = new Node(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Node temp = l1;
//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
        print(l1);
    }

    static void print(Node head){
        if(head == null){
            return;
        }

        print(head.next);
        System.out.print(head.data + " ");


    }
}
