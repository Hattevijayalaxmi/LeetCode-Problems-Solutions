//Power of Four - LeetCode 342

class Solution {
    public boolean isPowerOfFour(int n) {
        long i = 1;

        while (i < n) {
            i = i * 4;
        }
        return i == n;
    }
}
