package com.yhh.leetcode;

/*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

        你可以假设数组中无重复元素。

        示例 1:

        输入: [1,3,5,6], 5
        输出: 2
        示例 2:

        输入: [1,3,5,6], 2
        输出: 1*/

import java.util.LinkedList;
import java.util.List;

public class _35_SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        if(target<nums[0]){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                return i;
            }else if (nums[i]<target){
                index=i;
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=5;
        _35_SearchInsert searchInsert=new _35_SearchInsert();
        System.out.println(searchInsert.searchInsert(nums,target));
    }
}
