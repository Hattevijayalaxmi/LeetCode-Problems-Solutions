// Binary Tree Preorder Traversal - LeetCode 144

class Solution {
    List<Integer> output = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return output;

        output.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return output;
        
    }
}
