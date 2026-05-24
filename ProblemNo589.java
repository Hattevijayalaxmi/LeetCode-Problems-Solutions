// N-ary Tree Preorder Traversal - LeetCode 589


class Solution {
    List<Integer> output = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return output;

        output.add(root.val);
        for(Node child: root.children) {
                preorder(child);
            }

        return output;
    }
}
