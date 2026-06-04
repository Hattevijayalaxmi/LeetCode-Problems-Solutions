// Check if the Sentence is program - LeetCode 1832

import java.util.*;

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();

        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }

        return set.size() == 26;
    }
}
