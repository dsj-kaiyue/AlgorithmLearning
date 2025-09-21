package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class BinaryTreePreorderTraversal {

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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res=new ArrayList<>();
            if (root==null){
                return res;
            }
            res.add(root.val);

            res.addAll(preorderTraversal(root.left));
            res.addAll(preorderTraversal(root.right));


            return res;





        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new BinaryTreePreorderTraversal().new Solution();
        // put your test code here
        
    }
}