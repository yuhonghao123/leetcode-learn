package com.yhh.leetcode;

/*将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

        示例：

        输入：1->2->4, 1->3->4
        输出：1->1->2->3->4->4*/

import java.util.*;

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

    public static List<Integer> merge(List<Integer> l1,List<Integer> l2){
        if (l1==null)return l2;
        if (l2==null)return l1;
        int i=0,j=0;
        while (j<l2.size()){
            if (l2.get(j)>l1.get(l1.size()-1)){
                l1.add(l1.get(j));
                j++;
            }
            if (l1.get(i)>=l2.get(j)){
                l1.add(i,l2.get(j));
                j++;
            }else {
                i++;
            }
        }
        return l1;
    }

    static Random r = new Random();

    static int nextInt(int bound) {
        return r.nextInt(bound);
    }

    static List<Integer> genSortedList(int size, int bound) {

        List<Integer> l = new ArrayList<>(size);

        for (int i = 0; i < size; i ++) {
            l.add(nextInt(bound));
        }
         Collections.sort(l);

        return l;
    }

    public static void main(String[] args) {

        {
            List l1 = new ArrayList(Arrays.asList(0, 0, 0, 1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 8));
            List l2 = new ArrayList(Arrays.asList(0, 2, 7, 8, 9));
            List l = merge(l1, l2);


            System.out.println(l);
            System.out.println(l.size());
        }

        for (int i = 0; i < 0; i ++) {

            List l1 = genSortedList(20, 10);
            List l2 = genSortedList(5, 10);

            System.out.println(l1);
            System.out.println(l2);

            List l = merge(l1, l2);


            System.out.println(l);
            System.out.println(l.size());
        }
    }
}
