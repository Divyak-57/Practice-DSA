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
    public int ms = Integer.MIN_VALUE;
    public int solve(TreeNode root){
        if(root==null) return 0;
        int l = Math.max(0,solve(root.left)); // to handle negative value
        int r = Math.max(0,solve(root.right));
        int cs = root.val + l + r; // to get each root sum
        ms = Math.max(ms,cs); // get max sum
        return root.val + Math.max(l,r); 
    }
    public int maxPathSum(TreeNode root) {
       solve(root);
       return ms; 
    }
}
