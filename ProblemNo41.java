// First Missing Positive - LeetCode 41

import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int ans = 1;

        while (set.contains(ans)) {
            ans++;
        }

        return ans;
    }
}
