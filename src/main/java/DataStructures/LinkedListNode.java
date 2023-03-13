package DataStructures;

public class LinkedListNode {
    private int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public int val() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}

