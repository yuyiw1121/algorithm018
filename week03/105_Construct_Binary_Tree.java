/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = buildTreeHelper(preorder, inorder, 
                                        0, inorder.length - 1, 
                                        0, inorder.length-1);
        return root;
    }

    public TreeNode buildTreeHelper(int[] preorder, int[] inorder,
                                    int pre_left, int pre_right, 
                                    int in_left, int in_right) {
        if(pre_left > pre_right) return null;
        int pre_root = pre_left;
        // Get root
        TreeNode root = new TreeNode(preorder[pre_root]); 

        int in_root = -1; 
        // Find the root node in inorder
        for(int i = in_left; i <= in_right; i++) {
            if(inorder[i] == preorder[pre_root]){
                in_root = i;
                break;
            }
        }

        // Number of nodes in the left sub-tree
        int size_left_subtree = in_root-in_left;
        // Get left sub-tree
        root.left = buildTreeHelper(preorder, inorder,
                                    pre_left + 1, pre_left+size_left_subtree, 
                                    in_left, in_root - 1 );
        //Get right sub-tree
        root.right = buildTreeHelper(preorder, inorder,
                                    pre_left+size_left_subtree+1, pre_right,
                                    in_root + 1, in_right);
        
        return root;
    }
}