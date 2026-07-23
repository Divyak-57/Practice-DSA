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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0); // dummy for less than x
        ListNode greater = new ListNode(0); // dummy for greater than or equal for x

        ListNode l = less; // pointer for less
        ListNode g = greater; // pointer for greater
        ListNode cur =head;
        while(cur != null){ // until reach null
            if(cur.val<x){  // if less than x
                l.next=cur; // add to less and increment for cur to next val
                l=l.next; //also increment l pointer
            }else{
                g.next=cur; // otherwise do same for greater as less
                g=g.next;
            }
            cur=cur.next; //after iteration increment cur 
        }
        g.next=null; // null greater than connect to less by pointing less pointer to next of greater
        l.next=greater.next;
        return less.next; // return head of the less after connecting with greater
    }
}
