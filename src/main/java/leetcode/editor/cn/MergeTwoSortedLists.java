package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MergeTwoSortedLists {

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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dmerge=new ListNode(-1),p=dmerge;
            ListNode p1=l1,p2=l2;
            while (p1!=null && p2!=null){
                if (p1.val <p2.val){
                    p.next=p1;
                    p1=p1.next;
                }else{
                    p.next=p2;
                    p2=p2.next;
                }
                p=p.next;
            }
            if (p1==null){
                p.next=p2;
            }else{
                p.next=p1;
            }

            return dmerge.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
        // put your test code here
        ListNode l1=ListNode.createHead(new int[]{1,2,4});
        ListNode l2=ListNode.createHead(new int[]{1,3,4});
        ListNode result=solution.mergeTwoLists(l1,l2);
        ListNode.print(result);
    }
}


