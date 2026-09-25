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
    int solve(TreeNode root){
        if(root==null)return 0;
        int left=solve(root.left);
        int right=solve(root.right);
        if(left==0)root.left=null;
        if(right==0)root.right=null;
        return left+right+root.val;
    }
    public TreeNode pruneTree(TreeNode root) {
        int ans=solve(root);
        if(ans==0)return null;
        return root;
    }
}