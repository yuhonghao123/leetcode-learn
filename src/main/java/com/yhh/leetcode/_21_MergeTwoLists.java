package com.yhh.leetcode;

/*将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

        示例：

        输入：1->2->4, 1->3->4
        输出：1->1->2->3->4->4*/

/**
 * Definition for singly-linked list.
 *
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class _21_MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*ListNode l3=new ListNode(0);
        ListNode pre=l3;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                pre.next=l1;
                l1=l1.next;
            }else {
                pre=l2;
                l1=l2.next;
            }
            pre=pre.next;
        }
        return l3;*/
        if (l1==null){
            return l2;
        }if (l2==null){
            return l1;
        }if (l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        _21_MergeTwoLists mergeTwoLists=new _21_MergeTwoLists();

    }
}
