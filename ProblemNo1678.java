// Goal Parser Interpretation - LeetCode 1678

class Solution {
    public String interpret(String command) {
        return command.replace("()", "o")
                      .replace("(al)", "al");
    }
}
