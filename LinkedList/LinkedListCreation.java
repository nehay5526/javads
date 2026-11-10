package LinkedList;

public class LinkedListCreation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    Node addNode(Node head, int data){
        if(head ==null){
            return new Node(data);
        }
        Node current =head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = new Node(data);
        return head;
    }

    void printLinkedList(Node head){
        Node current = head;
         while(current!=null){
            System.out.println(current.data);
            current = current.next;
         }
    }

    Node reverseLinkedList(Node head){
        Node prev= null;
        Node current = head;
        Node next = null;
         while(current!=null){

            next= current.next;
            current.next = prev;
            prev= current;
            current = next;
         }
         return prev;
    }
    public static void main(String... args){
        LinkedListCreation ll = new LinkedListCreation();
        Node head = null;

        head = ll.addNode(head,0);
        head = ll.addNode(head,1);
        head = ll.addNode(head,2);
        head = ll.addNode(head,3);
        head = ll.addNode(head,4);
        head = ll.addNode(head,5);
        head = ll.addNode(head,6);

        ll.printLinkedList(head);

      head=  ll.reverseLinkedList(head);
          ll.printLinkedList(head);

    }
}
