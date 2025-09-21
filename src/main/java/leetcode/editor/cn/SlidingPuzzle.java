package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class SlidingPuzzle {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int slidingPuzzle(int[][] board) {
            //准备工作
            int m=2,n=3;
            String target="123450";
            StringBuilder sb=new StringBuilder();

            for (int i=0;i<m;i++){
                for (int j=0;j<n;j++){
                    sb.append(board[i][j]);
                }
            }
            String start=sb.toString();


            int[][] neighbor=new int[][]{
                    {1, 3},
                    {0, 4, 2},
                    {1, 5},
                    {0, 4},
                    {3, 1, 5},
                    {4, 2}
            };


            //BFS算法开始
            Queue<String> q=new LinkedList<>();
            HashSet<String> visited=new HashSet<>();
            q.offer(start);
            visited.add(start);

            int step=0;
            while (!q.isEmpty()){
                int sz=q.size();

                for (int i=0;i<sz;i++){
                    String cur=q.poll();
                    if (cur.equals(target)){
                        return step;
                    }

                    int idx=0;
                    for (;cur.charAt(idx)!='0';idx++);

                    for (int adj:neighbor[idx]){
                        String new_board=swap(cur.toCharArray(),adj,idx);

                        if (!visited.contains(new_board)){
                            q.offer(new_board);
                            visited.add(new_board);
                        }
                    }
                }
                step++;
            }
            return -1;
        }



        String swap(char[] chars,int i,int j){
            char temp=chars[j];
            chars[j]=chars[i];
            chars[i]=temp;
            return new String(chars);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new SlidingPuzzle().new Solution();
        // put your test code here
        int[][] board =new int[][]{{1,2,3},{4,0,5}};
        solution.slidingPuzzle(board);
    }
}