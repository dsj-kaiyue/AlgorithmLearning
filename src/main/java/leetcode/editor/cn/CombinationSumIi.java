package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class CombinationSumIi {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>>  res=new LinkedList<>();
        LinkedList<Integer>  track=new LinkedList<>();
        int trackSum=0;
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
                if (i>start && nums[i]==nums[i-1]){
                    continue;
                }
                track.add(nums[i]);
                trackSum+=nums[i];
                backTrack(nums,target,i+1);
                track.removeLast();
                trackSum-=nums[i];
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new CombinationSumIi().new Solution();
        // put your test code here
        
    }
}