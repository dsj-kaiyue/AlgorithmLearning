package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class Permutations {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res=new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            List<Integer> track=new ArrayList<>();
            boolean[] used =new boolean[nums.length];

            backtrack(nums,track,used);

            return res;
        }

        void backtrack(int nums[],List<Integer> track,boolean[] used){
            if (track.size()==nums.length){
                res.add(new ArrayList<>(track));
                return;
            }

            for (int i=0;i<nums.length;i++){
                if (used[i])
                    continue;

                used[i]=true;
                track.add(nums[i]);
                backtrack(nums,track,used);
                used[i]=false;
                track.remove(track.size()-1);
            }
        }


    }

    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
        // put your test code here
        int[] nums=new int[]{1,2,3};
        System.out.println(solution.permute(nums));
    }
}