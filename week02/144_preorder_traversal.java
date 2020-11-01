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
    public List<Integer> preorderTraversal(TreeNode root) {
        //前序遍历顺序： 根-左-右
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;

        Stack<TreeNode> nodes = new Stack<>();
        //push根
        nodes.push(root);

        while(!nodes.isEmpty()) {
            TreeNode cur = nodes.pop();
            if(cur != null) {
                //pop节点同时push此节点的左右子节点
                result.add(cur.val);
                nodes.push(cur.right);
                nodes.push(cur.left);
            }
            
        }

        return result;
    }
}