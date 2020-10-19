
public class No_344_Reverse_String {
    public static void main(String[] args) {
        char[] arr = new char[] { 'h', 'e', 'l', 'l', 'o' };
        ReverseString(arr);
        System.out.println(arr);
    }

    public static void ReverseString(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int right = arr.length - 1 - i;
            int left = i;
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static void ReverseStringLeetcode(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
