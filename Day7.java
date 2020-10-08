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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || k == 0) return head;
        
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        
        int rot_pnt = length - (k%length);
        temp = head;
        for(int i = 1 ; i < rot_pnt ; i++){
            temp = temp.next;
        }
        
        ListNode newHead = temp.next;
        temp.next = null;
        
        temp = newHead;
        if(temp != null){
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = head;
            return newHead;
        }else{
            return head;
        }
        
        
    }
}