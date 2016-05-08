package ds.linkedlist;

/**
 * Checks if a linked list of values forms a palindrome
 * Created by Sougata on 5/8/2016.
 */

/**
 * Input  : m -> ad -> a -> m -> NULL
 * Output : True
 * String "madam" is palindrome.
 *
 * Output : m -> ad -> a -> m -> a -> NULL
 * Output : False
 * String "madama" is not palindrome.
 */
public class PalindromeChecker {

    public boolean isPalindrome(final SinglyLinkedList singlyLinkedList) {
        SinglyLinkedListNode current = singlyLinkedList.getFirstNode();
        final StringBuilder stb = new StringBuilder();
        while (current != null) {
           stb.append(current.value);
            current = current.next;
        }
        return isPalindrome(stb.toString());
    }

    public boolean isPalindrome(final String string) {
        final int length = string.length();
        for (int index=0; index<length; index++) {
            if (string.charAt(index) != string.charAt(length - index - 1))
                return false;
        }
        return true;
    }

}
