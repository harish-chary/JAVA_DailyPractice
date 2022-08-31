class Solution {
    public ListNode reverseList(ListNode head) {
        // if(head==null || head.next==null) return head;
        // ListNode last = head, curr = head.next;
        // while(curr!=null){
        //     last.next = curr.next;
        //     curr.next = head;
        //     head = curr;
        //     curr = last.next;
        // }
        
        
        if(head==null || head.next==null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
        
        
        //return head;
    }
}
