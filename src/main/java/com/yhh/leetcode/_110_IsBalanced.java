package com.yhh.leetcode;

/*给定一个二叉树，判断它是否是高度平衡的二叉树。

        本题中，一棵高度平衡二叉树定义为：

        一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

        示例 1:

        给定二叉树 [3,9,20,null,null,15,7]

        3
        / \
        9  20
        /  \
        15   7
        返回 true 。*/

public class _110_IsBalanced {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        return Math.abs(hight(root.right)-hight(root.left))<2&&isBalanced(root.left)&&isBalanced(root.right);
    }
    public int hight(TreeNode root){
        if (root==null){
            return -1;
        }
        return 1+Math.max(hight(root.left),hight(root.right));
    }
}
