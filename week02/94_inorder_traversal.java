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
    public List<Integer> inorderTraversal(TreeNode root) {
        //前序遍历 左-根-右
        List<Integer> result = new ArrayList<Integer>();
        
        if(root == null) return result;
        Stack<TreeNode> nodes = new Stack<>();
        
        TreeNode cur = root;
        while(cur != null || !nodes.isEmpty()) {
            //add all the left child
            while(cur != null) {
                nodes.push(cur);
                cur = cur.left;
            }
            //now the top stack is the left most node
            cur = nodes.pop();
            result.add(cur.val);
            
            //now do the same for the right child
            cur = cur.right;
    
        }
        return result;
    }
        
}