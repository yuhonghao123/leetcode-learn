package com.yhh.leetcode;

/*给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
        使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

        例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

        与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _16_MaxTreeNumber {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int num1=Math.abs(nums[i]+nums[j]+nums[k]-target);
                    if (num1<=Math.abs(sum-target)){
                        sum=nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return sum;
    }
}
