package hackerrank;

import DataStructures.LinkedListNode;
import org.junit.Test;

import java.util.LinkedList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LinkedListPrinterTest {

    @Test
    public void testPrintLinkedList() {
        LinkedList list = new LinkedList<LinkedListNode>();
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);
        head.setNext(node2);
        node2.setNext(node3);
        list.add(head);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LinkedListPrinter.printLinkedList(list);

        String expectedOutput = "1\r\n2\r\n3\r\n";
        String actualOutput = outContent.toString();
        assertEquals(expectedOutput, actualOutput);

        System.setOut(System.out);
    }
}

