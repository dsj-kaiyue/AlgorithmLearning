package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class LianBiaoZhongDaoShuDiKgeJieDianLcof {

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode trainingPlan(ListNode head, int cnt) {
            ListNode p1=head;
            for (int i=0;i<cnt;i++){
                p1=p1.next;
            }
            ListNode p2=head;
            while(p1!=null){
                p1=p1.next;
                p2=p2.next;
            }
            return p2;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
        // put your test code here
        
    }
}