// Valid Palindrome - LeetCode 125

class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {

                sb.append(s.charAt(i));
            }
        }

        for (int i = 0; i < sb.length() / 2; i++) {

            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
