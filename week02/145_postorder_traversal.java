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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        
        if(root == null) return result;
        Stack<TreeNode> nodes = new Stack<>();
        
        nodes.push(root);
        while(!nodes.isEmpty()) {
            TreeNode cur = nodes.pop();
            if(cur != null) {
                result.addFirst(cur.val);
                nodes.push(cur.left);
                nodes.push(cur.right);
            }
            
        }
        return result;
    }
}