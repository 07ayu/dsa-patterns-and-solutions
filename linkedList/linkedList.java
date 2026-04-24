package linkedList;

public class linkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data) {

        //1. create new node;
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        //2. new node = head;link
        newNode.next = head;

        //3. head = newNode;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data); //1. create new node
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {

        if (head == null) {
            System.out.println("LL is EMPTY");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addMidddle(int data, int idx) {
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void main(String[] args) {

        linkedList ll = new linkedList();
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();

        ll.addFirst(1);
        ll.printLL();

        ll.addLast(3);
        ll.printLL();

        ll.addLast(4);
        ll.printLL();

        ll.addMidddle(10, 0);
        ll.printLL();

        System.out.println(ll.size);


    }
    
}
