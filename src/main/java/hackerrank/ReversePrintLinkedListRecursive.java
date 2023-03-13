package hackerrank;

import DataStructures.LinkedListNode;
import java.util.LinkedList;

public class ReversePrintLinkedListRecursive {
    public static void reversePrint(LinkedList<LinkedListNode> linkedList) {
        reversePrintHelper(linkedList.getFirst());
    }

    public static void reversePrintHelper(LinkedListNode node) {
        if (node == null) {
            return;
        }
        reversePrintHelper(node.getNext());
        System.out.println(node.val());
    }

}

