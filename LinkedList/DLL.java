package LinkedList;

public class DLL {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next= this.prev = null;
        }
    }
    class DoublyList{
        Node head;
        Node tail;
        DoublyList(){
            this.head = this.tail = null;
        }
        public void addNode(int data){
            Node newNode = new Node(data);
            if(head ==null){
                head = tail = newNode;
            }else{
             newNode.next = head;
             head.prev = newNode;
             head = newNode;
              
            }
        }

        public void pushBack(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next = newNode;
                newNode.prev= tail;
                tail = newNode;
            }
        }

        public void print(){
           Node current = head;
           while(current!=null){
            System.out.println(current.data);
            current = current.next;
           }
        }
    } 

    public static void main(String... args){
        DLL dll = new DLL();
        DoublyList list = dll.new DoublyList();
        list.addNode(0);    
        list.addNode(1);
        list.addNode(2);        
        list.addNode(3);
        list.pushBack(4);
        list.pushBack(5);
        list.print();
    }
}
