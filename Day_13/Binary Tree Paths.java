/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr = new ArrayList<>();
        if(root != null) solve(root, "", arr);
        return arr;
    }

    public void solve(TreeNode root, String path, List<String> arr) {
        if(root.left == null && root.right == null) arr.add(path + root.val);
        if(root.left != null) solve(root.left, path + root.val + "->", arr);
        if(root.right != null) solve(root.right, path + root.val + "->", arr);
    }
}