package leetcode.editor.cn;

import leetcode.editor.common.ListNode;

import java.util.*;

public class FindKPairsWithSmallestSums {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((a, b)->(a[0]+a[1])-(b[0]+b[1]));

            for (int i=0;i<nums1.length;i++){
                priorityQueue.add(new int[]{nums1[i],nums2[0],i,0});
            }

            List<List<Integer>>  res=new ArrayList<>();


            while (!priorityQueue.isEmpty() && k>0){
                int[] cur=priorityQueue.poll();
                int i=cur[2],j=cur[3];

                List<Integer> pair=new ArrayList<>();
                pair.add(cur[0]);
                pair.add(cur[1]);


                if (j+1< nums2.length){
                    priorityQueue.add(new int[]{nums1[i],nums2[j+1],i,j+1});
                }

                res.add(pair);

                k--;
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new FindKPairsWithSmallestSums().new Solution();
        // put your test code here
        
    }
}