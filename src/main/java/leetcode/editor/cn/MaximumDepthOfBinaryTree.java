package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MaximumDepthOfBinaryTree {

    //leetcode submit region begin(Prohibit modification and deletion)
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
        /**
         * 遍历思路
        int depth=0;
        int res=0;
        public int maxDepth(TreeNode root) {
            traves(root);
            return res;
        }

        void traves(TreeNode root){
            if (root==null){
                return ;
            }
            depth++;

            if (root.left==null && root.right==null){
                res=Math.max(res,depth);
            }
            traves(root.left);
            traves(root.right);

            depth--;
        }
         */

        public int maxDepth(TreeNode root) {
            if (root==null)
                return 0;

            int leftmax=maxDepth(root.left);
            int rightmax=maxDepth(root.right);

            return 1+Math.max(leftmax,rightmax);
        }
    }

    //递归思路


    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
        // put your test code here
        
    }
}