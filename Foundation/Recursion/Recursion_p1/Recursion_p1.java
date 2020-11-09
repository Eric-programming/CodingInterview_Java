package Recursion.Recursion_p1;

import java.util.Arrays;

/**
 * Recursion_p1
 */
public class Recursion_p1 {

    public static void main(String[] args) {
        char[] str = { 'E', 'R', 'I', 'C' };
        // warm_up(str);
        reverseString(str);
    }

    /**
     * Print a string in reverse order using recursion
     */
    public static void warm_up(char[] str) {
        String word = warm_up_recur(str, str.length - 1);
        System.out.println(word);
    }

    public static String warm_up_recur(char[] str, int index) {
        if (str == null || str.length == 0) {
            return null;
        }
        if (index == 0) {
            return str[index] + "";
        }
        return str[index] + warm_up_recur(str, index - 1);
    }

    /**
     * Reverse a string in char[] using recursion
     */
    public static void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            System.out.println(Arrays.toString(s));
        }
        reverseStringRecur(s, 0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseStringRecur(char[] s, int f, int l) {
        if (f < l) {
            char temp = s[f];
            s[f] = s[l];
            s[l] = temp;
            reverseStringRecur(s, f + 1, l - 1);
        }
        return;
    }
}