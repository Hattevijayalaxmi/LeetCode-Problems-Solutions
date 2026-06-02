// Second Largest Digit in a String - LeetCode 1796

class Solution {
    public int secondHighest(String s) {
        int n = -1;
        int m = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit > n) {
                    m = n;
                    n = digit;
                } else if (digit < n && digit > m) {
                    m = digit;
                }
            }
        }

        return m;
    }
}
