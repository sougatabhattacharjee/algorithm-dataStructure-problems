package ds.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sougata on 5/8/2016.
 */
public class TestCheckPalindrome extends LinkedListHelper {

    @Test
    public void checkPalindrome() {
        final PalindromeChecker palindromeChecker = new PalindromeChecker();

        final SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add("m");
        singlyLinkedList.add("a");
        singlyLinkedList.add("d");
        singlyLinkedList.add("a");
        singlyLinkedList.add("m");

        assertTrue(palindromeChecker.isPalindrome(singlyLinkedList));

        singlyLinkedList.add("v");
        singlyLinkedList.add("a");

        assertFalse(palindromeChecker.isPalindrome(singlyLinkedList));
    }
}
