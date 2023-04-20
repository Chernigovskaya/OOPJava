package alg;

import static alg.LinkedList.printLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addToEnd(1);
        myList.addToEnd(2);
        myList.addToEnd(3);
        myList.addToEnd(4);
        myList.addToEnd(5);


        printLinkedList(myList);
        myList.revertList();
        System.out.println();
        printLinkedList(myList);
    }
}
