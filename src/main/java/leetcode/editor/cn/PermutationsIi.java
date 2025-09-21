package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class PermutationsIi {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>>  res=new LinkedList<>();
        LinkedList<Integer> track=new LinkedList<>();
        boolean[] used;


        public List<List<Integer>> permuteUnique(int[] nums) {
            used=new boolean[nums.length];
            Arrays.sort(nums);

            backTrack(nums);
            return res;

        }

        void backTrack(int[] nums){
            if (track.size()==nums.length){
                res.add(new LinkedList<>(track));
            }
            for (int i=0;i<nums.length;i++){
                if (used[i]){
                    continue;
                }
                if (i>0 && nums[i]==nums[i-1] && !used[i-1]){
                    continue;
                }
                track.add(nums[i]);
                used[i]=true;
                backTrack(nums);
                track.removeLast();
                used[i]=false;
            }
        }



    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new PermutationsIi().new Solution();
        // put your test code here
        
    }
}