package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class RemoveDuplicatesFromSortedListIi {

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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummyUnip=new ListNode(101);
            ListNode dummyDup=new ListNode(101);

            ListNode pUnip=dummyUnip,pDup=dummyDup,p=head;

            while (p!=null){
                if ((p.next!=null && p.val==p.next.val) || p.val==pDup.val){
                    pDup.next=p;
                    pDup=pDup.next;
                }else{
                    pUnip.next=p;
                    pUnip=pUnip.next;
                }

                p=p.next;

                pUnip.next=null;
                pDup.next=null;

            }
            return dummyUnip.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedListIi().new Solution();
        // put your test code here
        
    }
}