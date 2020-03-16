package com.yhh.leetcode;

/*给定一个二叉树，检查它是否是镜像对称的。

        例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

        1
        / \
        2   2
        / \ / \
        3  4 4  3
        但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

        1
        / \
        2   2
        \   \
        3    3*/

public class _101_IsSymmetric {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root,root);
    }
    public boolean symmetric(TreeNode p,TreeNode q){
        if (p==null&&q==null){
            return true;
        }else if (p!=null&&q!=null&&p.val==q.val){
            return symmetric(q.right,p.left)&&symmetric(q.left,p.right);
        }
        return false;
    }
}
