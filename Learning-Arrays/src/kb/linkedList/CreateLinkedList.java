package kb.linkedList;

public class CreateLinkedList {

    public static void reversePrint(Node head){
        if (head == null) return;

        reversePrint(head.address);
        System.out.print(head.data + " ");

    }


    public static void recursionDisplay(Node head){

        if(head == null) return;

        System.out.print(head.data + " ");

        recursionDisplay(head.address);

    }

    public static void display(Node a){
        Node temp = a;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.address;
        }
    }

    // node create in linkedList
    public  static class Node{
        int data;
        Node address;

        Node(int data){
            this.data = data;
        };

    };

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(7);
        Node e = new Node(9);
        Node f = new Node(10);

        a.address = b;
        b.address = c;
        c.address = e;
        e.address = f;
        System.out.println("normal print");
        display(a);

        System.out.println("\nRecursion print");
        recursionDisplay(a);

        System.out.println("\nreverse Print in Recursion");
        reversePrint(a);






    }



}
