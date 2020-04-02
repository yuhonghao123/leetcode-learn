package com.yhh.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _34_SearchRangeTest {
    _34_SearchRange searchRange=new _34_SearchRange();

    @Test
    public void searchRange() {
        int[] nums={5,7,7,8,8,10};
        int target = 8;
        int[] result={3,4};
        Assert.assertArrayEquals(result,searchRange.searchRange(nums,target));
    }
}