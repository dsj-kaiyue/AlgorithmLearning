package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class SubsetsIi {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res=new LinkedList<>();
        LinkedList<Integer> track=new LinkedList<>();


        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            backTrack(nums,0);
            return res;
        }


        void backTrack(int[] nums,int start){
            res.add(new LinkedList<>(track));
            for (int i=start;i<nums.length;i++){
                if (i>start && nums[i]==nums[i-1]){
                    continue;
                }
                track.add(nums[i]);
                backTrack(nums,i+1);
                track.removeLast();
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new SubsetsIi().new Solution();
        // put your test code here
        
    }
}