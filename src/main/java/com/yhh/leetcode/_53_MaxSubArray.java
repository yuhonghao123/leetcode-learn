package com.yhh.leetcode;

/*给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

        示例:

        输入: [-2,1,-3,4,-1,2,1,-5,4],
        输出: 6
        解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。*/

public class _53_MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max=0;
        for (int i = 1; i < nums.length; i++) {
            nums[i]=Math.max(nums[i],nums[i]+nums[i-1]);
            max=Math.max(max,nums[i]);
        }
        if (nums.length==1){
            return nums[0];
        }else {
            return max;
        }
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        _53_MaxSubArray maxSubArray=new _53_MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(nums));
    }
}
