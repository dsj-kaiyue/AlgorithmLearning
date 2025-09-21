package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.common.*;

public class MinimumWindowSubstring {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minWindow(String s, String t) {
            Map<Character,Integer> need=new HashMap<>();
            Map<Character,Integer> window=new HashMap<>();

            for (int i=0;i<t.length();i++){
                need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
            }

            int left=0,right=0,valid=0,start=0,len=Integer.MAX_VALUE;

            while(right<s.length()){
                char c=s.charAt(right);
                right++;

                if (need.containsKey(c)){
                    window.put(c,window.getOrDefault(c,0)+1);
                    if (window.get(c).equals(need.get(c))){
                        valid++;
                    }
                }

                while (valid==need.size()){
                    if (right-left<len){
                        len=right-left;
                        start=left;
                    }

                    char d=s.charAt(left);
                    left++;

                    if (need.containsKey(d)){
                        if (window.get(d).equals(need.get(d))){
                            valid--;
                        }
                        window.put(d,window.get(d)-1);
                    }

                }
            }

            return len==Integer.MAX_VALUE?"":s.substring(start,start+len);


        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new MinimumWindowSubstring().new Solution();
        // put your test code here

        String s="ADOBECODEBANC",t="ABC";
        System.out.println(solution.minWindow(s,t));

    }
}