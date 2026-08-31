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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        /*int n=1;
        ListNode cur=head;
        while(cur.next!=null){
            n++;
            cur=cur.next;
        }
        if(n==2) return new int[]{-1,-1};*/
        ListNode cur=head;
        int idx=1,prevData=0,nextData=0;
        List<Integer> list=new ArrayList<>();
        while(cur.next!=null){
            idx++;
            prevData=cur.val;
            cur=cur.next;
            if(cur.next!=null) nextData=cur.next.val;
            if(prevData<cur.val && nextData<cur.val) list.add(idx);
            if(prevData>cur.val && nextData>cur.val) list.add(idx);
        }
        //System.out.println(list);
        if(list.size()<2) return new int[]{-1,-1};
        int[] res=new int[2];
        res[0]=Integer.MAX_VALUE;
        res[1]=list.get(list.size()-1)-list.get(0);
        for(int i=0;i<list.size()-1;i++){
            int diff=list.get(i+1)-list.get(i);
            res[0]=Math.min(res[0],diff);
            //res[1]=Math.max(res[1],diff);
        }
        return res;
    }
}