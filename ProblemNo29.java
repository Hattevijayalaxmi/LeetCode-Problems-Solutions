// Divide Two Integers - LeetCode 29

class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int count = 0;

        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);

        while(a >= b) {
            a = a - b;
            count++;
        }

        if((dividend < 0 && divisor > 0) || 
           (dividend > 0 && divisor < 0)) {
            return -count;
        }

        return count;
    }
}
