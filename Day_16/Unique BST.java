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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<>();
        return solve(1, n, new HashMap<>());
    }

    private List<TreeNode> solve(int start, int end, Map<Pair<Integer, Integer>, List<TreeNode>> memo) {
        Pair<Integer, Integer> key = new Pair<>(start, end);
        if(memo.containsKey(key)) {
            return memo.get(key);
        }

        List<TreeNode> result = new ArrayList<>();
        if(start > end) {
            result.add(null);
            memo.put(key, result);
            return result;
        }

        for(int i = start; i<=end; i++) {
            List<TreeNode> leftTree = solve(start, i-1,memo);
            List<TreeNode> rightTree = solve(i+1, end,memo);

            for(TreeNode left: leftTree) {
                for(TreeNode right: rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        
        }
        memo.put(key, result);
        return result;
    }
}