package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class Subsets {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res=new LinkedList<>();
        LinkedList<Integer> track=new LinkedList<>();
        public List<List<Integer>> subsets(int[] nums) {
            backtrack(nums,0);
            return res;
        }

        void backtrack(int[] nums,int start){
            res.add(new LinkedList<>(track));


            for (int i = start; i<nums.length; i++){
                track.add(nums[i]);
                backtrack(nums,i+1);
                track.removeLast();
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new Subsets().new Solution();
        // put your test code here
        
    }
}