package hackerrank;

import DataStructures.LinkedListNode;
import java.util.LinkedList;

public class LinkedListPrinter {
    public static void printLinkedList(LinkedList<LinkedListNode> list) {
        LinkedListNode curr = list.getFirst();
        while(curr != null) {
            System.out.println(curr.val());
            curr = curr.getNext();
        }
    }
}
