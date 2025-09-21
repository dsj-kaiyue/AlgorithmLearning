package leetcode.editor.cn;

import java.util.*;

import com.sun.jdi.event.StepEvent;
import leetcode.editor.common.*;

public class OpenTheLock {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int openLock(String[] deadends, String target) {
            //记录死亡数字
            Set<String> deads=new HashSet<>();
            for (String str:deadends){
                deads.add(str);
            }
            if (deads.contains("0000")){
                return -1;
            }


            //记录已经BFS过的组合
            Queue<String> q=new LinkedList<>();
            HashSet<String> visited=new HashSet<>();
            q.add("0000");
            visited.add("0000");

            int step=0;
            //开始BFS
            while (!q.isEmpty()){
                int sz=q.size();

                for (int i=0;i<sz;i++){
                    String cur=q.poll();
                    if (cur.equals(target)){
                        return step;
                    }
                    for (String neighbor:getNeighours(cur)){
                        if (!visited.contains(neighbor) && !deads.contains(neighbor)){
                            q.add(neighbor);
                            visited.add(neighbor);
                        }
                    }
                }
                step++;
            }
            return -1;
        }
        List<String> getNeighours(String s){
            List<String> neighbours=new ArrayList<>();
            for (int i=0;i<4;i++){
                neighbours.add(plusOne(s,i));
                neighbours.add(minOne(s,i));
            }
            return neighbours;
        }


        String plusOne(String s,int i){
            char[] chars=s.toCharArray();
            if (chars[i]=='9'){
                chars[i]='0';
            }else {
                chars[i]++;
            }
            return new String(chars);
        }

        String minOne(String s,int i){
            char[] chars=s.toCharArray();
            if (chars[i]=='0'){
                chars[i]='9';
            }else {
                chars[i]--;
            }
            return new String(chars);
        }


    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new OpenTheLock().new Solution();
        // put your test code here
        
    }
}