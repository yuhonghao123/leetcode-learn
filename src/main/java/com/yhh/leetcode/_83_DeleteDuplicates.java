package com.yhh.leetcode;

/*给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

        示例 1:

        输入: 1->1->2
        输出: 1->2
        示例 2:

        输入: 1->1->2->3->3
        输出: 1->2->3*/



public class _83_DeleteDuplicates {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            x=val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre=head;
        while (pre!=null&&pre.next!=null){
            if (pre.next.val==pre.val){
                pre.next=pre.next.next;
            }else {
                pre=pre.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        _83_DeleteDuplicates deleteDuplicates=new _83_DeleteDuplicates();

    }
}
