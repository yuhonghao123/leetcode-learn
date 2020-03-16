package com.yhh.leetcode;

/*给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

        例如：
        给定二叉树 [3,9,20,null,null,15,7],

        3
        / \
        9  20
        /  \
        15   7
        返回其自底向上的层次遍历为：

        [
        [15,7],
        [9,20],
        [3]
        ]*/

import java.util.ArrayList;
import java.util.List;

public class _107_LevelOrderBottom {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> pre=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        if (root==null){
            return result;
        }
        List<Integer> list1=new ArrayList<>();
        list1.add(root.val);
        pre.add(list1);
        test(root.left,root.right,pre);

        for (int i = pre.size()-1; i >=0; i--) {
            result.add(pre.get(i));
        }

        return result;

    }
    public void test(TreeNode t1,TreeNode t2,List<List<Integer>> pre){
        if (t1==null&&t2==null){
            return;
        }
        List<Integer> list=new ArrayList<>();
        if (t1!=null&&t2!=null) {
            list.add(t1.val);
            list.add(t2.val);
            pre.add(list);
            test(t2.left, t2.right, pre);
            test(t1.left, t1.right, pre);
        }
    }
}
