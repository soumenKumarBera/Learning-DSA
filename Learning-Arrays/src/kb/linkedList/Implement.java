package kb.linkedList;

public class Implement {

    public static class Node{
        int data;
        Node next;

         Node(int data){
             this.data = data;
         }
    };

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
            }else {
                tail.next = temp;
            };
            tail = temp;

        }

        void display(){
            Node temp = head;

            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;

            }


        }



    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(43);
        list.insertAtEnd(65);
        list.insertAtEnd(34);
        list.insertAtEnd(87);
        list.insertAtEnd(23);

        list.display();
    };
};
