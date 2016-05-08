package ds.linkedlist;

/**
 * Created by Sougata on 5/8/2016.
 */
public class LinkedListHelper {

    public void traversal(SinglyLinkedList singlyLinkedList) {
        SinglyLinkedListNode current = singlyLinkedList.getFirstNode();
        while (current != null) {
            printNode(current);
            current = current.next;
        }
    }

    public void printNode(SinglyLinkedListNode node) {
        System.out.print(node.value + " ");
    }
}
