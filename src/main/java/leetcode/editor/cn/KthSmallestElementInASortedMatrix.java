package leetcode.editor.cn;

import java.util.*;

public class KthSmallestElementInASortedMatrix {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(3, (a, b) -> (a[0] - b[0]));

            for (int i = 0; i < matrix.length; i++) {
                priorityQueue.add(new int[]{matrix[i][0], i, 0});
            }

            int res = 0;
            while (k > 0) {
                int[] cur = priorityQueue.poll();

                res = cur[0];
                int i = cur[1];
                int j = cur[2];


                if (j + 1 < matrix[i].length) {
                    priorityQueue.add(new int[]{matrix[i][j + 1], i, j + 1});
                }

                k--;


            }

            return res;


        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new KthSmallestElementInASortedMatrix().new Solution();
        // put your test code here
        
    }
}