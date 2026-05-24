// N-ary Tree Postorder Traversal - LeetCode 590


class Solution {
    List<Integer> output = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if(root == null) return output;

        for(Node child : root.children) {
            postorder(child);
        }

        output.add(root.val);

        return output;
    }
}
