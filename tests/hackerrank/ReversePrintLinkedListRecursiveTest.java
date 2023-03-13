package hackerrank;
import DataStructures.LinkedListNode;
import static org.mockito.Mockito.*;
import java.util.LinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReversePrintLinkedListRecursiveTest {
    @Test
    public void testReversePrintRecursive() {
        LinkedList<LinkedListNode> linkedList = new LinkedList<>();
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);
        node1.next = node2;
        node2.next = node3;
        linkedList.add(node1);
        ReversePrintLinkedListRecursive.reversePrint(linkedList);

        ReversePrintLinkedListRecursive reversePrintLinkedListRecursive = spy(new ReversePrintLinkedListRecursive());
        reversePrintLinkedListRecursive.reversePrint(linkedList);
        verify(reversePrintLinkedListRecursive, times(3)).reversePrint(linkedList);

    }
}



