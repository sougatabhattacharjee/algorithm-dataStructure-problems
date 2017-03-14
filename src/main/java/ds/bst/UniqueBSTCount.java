package ds.bst;

/**
 * Created by sougata on 14/03/2017.
 */

/**
 * http://www.geeksforgeeks.org/g-fact-18/
 */
public class UniqueBSTCount {


    static int getUniqueBSTs(int n) {
        if(n <= 1) return 1;

        int sum = 0;
        for(int i=1; i<=n; i++) {
            int left = getUniqueBSTs(i-1);
            int right = getUniqueBSTs(n-i);
            sum+= left*right;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("getUniqueBSTs(4) = " + getUniqueBSTs(4));
    }
}
