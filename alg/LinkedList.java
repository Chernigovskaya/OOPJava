package alg;

public class LinkedList {

    Node head;
    Node tail;
    public class Node {
        int value;
        Node next;
        Node prev;
    }

    public void addToEnd(int number) {
        LinkedList.Node node = new LinkedList.Node();
        node.value = number;
        if (head == null) {
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    public void addToHead(int number, Node node) {
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = number;
        node.next = newNode;
        newNode.prev = node;
        if (next == null) {
            tail = newNode;
        }
        else {
            next.prev = newNode;
            newNode.next = next;
        }
    }


    public void  revertList(){
        LinkedList.Node curNode = head;
        while (curNode != null) {
            LinkedList.Node next = curNode.next;
            LinkedList.Node prev = curNode.prev;
            curNode.next = prev;
            curNode.prev = next;
            if (prev == null) {
                tail = curNode;
            }
            if (next == null) {
                head = curNode;
            }
            curNode = next;
        }
    }

        public static void printLinkedList(LinkedList list) {
        LinkedList.Node currNode = list.head;
        while (currNode != null) {
            System.out.print(currNode.value + "  ");
            currNode = currNode.next;
        }
    }

}
