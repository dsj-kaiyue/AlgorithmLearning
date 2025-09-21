package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class CombinationSum {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res=new LinkedList<>();
        LinkedList<Integer> track=new LinkedList<>();
        int trackSum=0;

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            backTrack(candidates,target,0);

            return res;
        }


        void backTrack(int[] nums,int target,int start){
            if (trackSum==target){
                res.add(new LinkedList<>(track));
                return;
            }
            if (trackSum >target){
                return;
            }

            for (int i=start;i<nums.length;i++){
                trackSum+=nums[i];
                track.add(nums[i]);
                backTrack(nums,target,i);
                trackSum-=nums[i];
                track.removeLast();
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
        // put your test code here
        
    }
}