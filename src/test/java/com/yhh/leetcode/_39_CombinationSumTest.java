package com.yhh.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class _39_CombinationSumTest {

    private _39_CombinationSum combinationSum=new _39_CombinationSum();

    @Test
    public void combinationSum() {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list1.add(3);
        List<Integer> list2=new ArrayList<>();
        list2.add(7);
        lists.add(list1);
        lists.add(list2);
        int[] candidates=new int[]{2,3,6,7};
        int target=7;
        Assert.assertEquals(lists,combinationSum.combinationSum(candidates,target));
    }
}