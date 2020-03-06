package com.yhh.leetcode;

/*给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
        使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
        注意：答案中不可以包含重复的三元组。

        示例：

        给定数组 nums = [-1, 0, 1, 2, -1, -4]，

        满足要求的三元组集合为：
        [
        [-1, 0, 1],
        [-1, -1, 2]
        ]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_ThreeNumbersSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> num2=new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i]+nums[j]+nums[k]==0){
                        List<Integer> num1=new ArrayList<Integer>();
                        num1.add(nums[i]);
                        num1.add(nums[j]);
                        num1.add(nums[k]);
                        num2.add(num1);
                    }
                }
            }
        }
        for (int i = 0; i < num2.size(); i++) {
            for (int j =i+1; j < num2.size(); j++) {
                if (num2.get(i).equals(num2.get(j))){
                    num2.remove(j);
                    j--;
                }
            }
        }
        return num2;
    }

    public static void main(String[] args) {
        int[] nums={-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        _15_ThreeNumbersSum threeNumbersSum=new _15_ThreeNumbersSum();
        List<List<Integer>> num=new ArrayList<List<Integer>>();
        num=threeNumbersSum.threeSum(nums);
        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < num.get(i).size(); j++) {
                System.out.print(num.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
