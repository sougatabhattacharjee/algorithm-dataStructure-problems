package ds.linkedlist;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * Created by Sougata on 5/7/2016.
 */
public class SinglyLinkedList<T> {

    private SinglyLinkedListNode head;
    private SinglyLinkedListNode tail;

    private transient int size = 0;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    private void addFirst(final SinglyLinkedListNode newNode) {
        if (newNode == null)
            return;
        else {
            if (head == null) {
                newNode.next = null;
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }
    }

    private void addLast(final SinglyLinkedListNode newNode) {
        if (newNode == null)
            return;
        else {
            newNode.next = null;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            size++;
        }
    }

    private void insertAfter(SinglyLinkedListNode previous,
                            SinglyLinkedListNode newNode) {
        if (newNode == null)
            return;
        else {
            if (previous == null) {
                addFirst(newNode);
                return;
            }
            else if (previous.value == tail.value) {
                addLast(newNode);
                return;
            }
            else {
                SinglyLinkedListNode next = previous.next;
                previous.next = newNode;
                newNode.next = next;
            }

            size++;
        }
    }

    private void insertBefore(SinglyLinkedListNode after,
                             SinglyLinkedListNode newNode) {
        if (newNode == null)
            return;
        else {
            if (after == null || after.value == head.value) {
                addFirst(newNode);
                return;
            }
            else {
                SinglyLinkedListNode current = head;
                while (current != null) {
                    SinglyLinkedListNode next = current.next;
                    if (next.value == after.value) {
                        SinglyLinkedListNode tmp = next;
                        current.next = newNode;
                        newNode.next = tmp;
                        break;
                    }
                    current = current.next;
                }
                size++;
            }
        }
    }

    /**
     * public methods
     */

    public void add(final T t) {
        if (head==null) {
            addNodeFirst(t);
        }
        else {
            addNodeLast(t);
        }
    }

    public T getFirst() {
        final SinglyLinkedListNode<T> head = this.head;
        if (head == null)
            throw new NoSuchElementException();
        return head.value;
    }

    public SinglyLinkedListNode getFirstNode() {
        final SinglyLinkedListNode<T> head = this.head;
        if (head == null)
            throw new NoSuchElementException();
        return head;
    }

    public T getLast() {
        final SinglyLinkedListNode<T> last = this.tail;
        if (last == null)
            throw new NoSuchElementException();
        return last.value;
    }

    public SinglyLinkedListNode getLastNode() {
        final SinglyLinkedListNode<T> last = this.tail;
        if (last == null)
            throw new NoSuchElementException();
        return last;
    }

    public int size() {
        return this.size;
    }

    public void addNodeFirst(final T t) {
        final SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(t);
        this.addFirst(singlyLinkedListNode);
    }

    public void addNodeLast(final T t) {
        final SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(t);
        this.addLast(singlyLinkedListNode);
    }

    public void insertBefore(final SinglyLinkedListNode after, final T valueToBeInserted) {
        final SinglyLinkedListNode nodeToBeInserted = new SinglyLinkedListNode(valueToBeInserted);
        this.insertBefore(after, nodeToBeInserted);
    }

    public void insertAfter(final SinglyLinkedListNode previous, final T valueToBeInserted) {
        final SinglyLinkedListNode nodeToBeInserted = new SinglyLinkedListNode(valueToBeInserted);
        this.insertAfter(previous, nodeToBeInserted);
    }
}
