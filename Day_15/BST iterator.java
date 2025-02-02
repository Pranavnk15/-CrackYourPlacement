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
class BSTIterator {
    private List<Integer> nodes;
    private Iterator<Integer> iterator;

    public BSTIterator(TreeNode root) {
        nodes = new ArrayList<>();
        inorder(root);
        iterator = nodes.iterator();
    }
    
    public int next() {
        return iterator.next();
    }
    
    public boolean hasNext() {
        return iterator.hasNext();
    }

    private void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        nodes.add(root.val);
        inorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */