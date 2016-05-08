package ds.linkedlist;

/**
 * Created by Sougata on 5/7/2016.
 */
public class SinglyLinkedListNode<T> {

    public T value;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(T value) {
        this.value = value;
        this.next = null;
    }
}
