class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null) return head;
        ListNode fast =head, slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
