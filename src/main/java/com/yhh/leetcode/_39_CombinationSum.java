package com.yhh.leetcode;

/*给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

        candidates 中的数字可以无限制重复被选取。

        说明：

        所有数字（包括 target）都是正整数。
        解集不能包含重复的组合。 
        示例 1:

        输入: candidates = [2,3,6,7], target = 7,
        所求解集为:
        [
        [7],
        [2,2,3]
        ]*/

import java.util.ArrayList;
import java.util.List;

public class _39_CombinationSum {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates==null||target<0){
            return result;
        }
        List<Integer> list=new ArrayList<>();
        test(candidates,target,list);
        return result;
    }

    private void test(int[] candidates, int target, List<Integer> list) {
        if (target<0){
            return;
        }
        if (target==0){
            List<Integer> list1=new ArrayList<>();
            list1.addAll(list);
            result.add(list1);
        }
        for (int i = 0; i < candidates.length; i++) {
            list.add(candidates[i]);
            test(candidates,target-candidates[i],list);
            list.remove(list.size()-1);
        }
    }
}
