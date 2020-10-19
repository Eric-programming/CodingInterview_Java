
public class No_13_Roman_to_Integer {
    public static void main(String[] args) {
        System.out.println(RomanToInteger("III"));// 3
        System.out.println(RomanToInteger("IV"));// 4
        System.out.println(RomanToInteger("IX"));// 9
        System.out.println(RomanToInteger("LVIII"));// 58
        System.out.println(RomanToInteger("MCMXCIV"));// 1994
    }

    public static final int I = 1;
    public static final int V = 5;
    public static final int X = 10;
    public static final int L = 50;
    public static final int C = 100;
    public static final int D = 500;
    public static final int M = 1000;

    public static int RomanToInteger(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentCharaterValue = SingleRomanToInteger(s.charAt(i));
            if (i == s.length() - 1) {
                total += currentCharaterValue;
            } else {
                int nextCharacterValue = SingleRomanToInteger(s.charAt(i + 1));
                if (currentCharaterValue < nextCharacterValue) {
                    total -= currentCharaterValue;
                }
                if (currentCharaterValue >= nextCharacterValue) {
                    total += currentCharaterValue;
                }
            }
        }
        return total;
    }

    public static int SingleRomanToInteger(char i) {
        switch (i) {
            case 'I':
                return I;
            case 'V':
                return V;
            case 'X':
                return X;
            case 'L':
                return L;
            case 'C':
                return C;
            case 'D':
                return D;
            case 'M':
                return M;
            default:
                return 0;
        }
    }
}
