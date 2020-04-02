package com.yhh.leetcode;

/*给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

        你的算法时间复杂度必须是 O(log n) 级别。

        如果数组中不存在目标值，返回 [-1, -1]。

        示例 1:

        输入: nums = [5,7,7,8,8,10], target = 8
        输出: [3,4]
        示例 2:

        输入: nums = [5,7,7,8,8,10], target = 6
        输出: [-1,-1]*/

public class _34_SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                result[0]=i;
                break;
            }
        }
        for (int i = nums.length-1; i >=0; i--) {
            if (nums[i]==target){
                result[1]=i;
                break;
            }
        }
        return result;
    }
}
