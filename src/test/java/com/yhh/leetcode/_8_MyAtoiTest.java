package com.yhh.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _8_MyAtoiTest {

    private _8_MyAtoi myAtoi=new _8_MyAtoi();

    private static String[][] TEST_NUMS;

    @Before
    public void setup(){
        TEST_NUMS=new String[][]{
                {"42","42"},
                {"   -42","-42"},
//                {"4193 with words","4193"},
//                {"words and 987","0"},
//                {"-+42","-42"},
//                {"-+42","-42"},
//                {"99999999999999999999999999999999","-1"},
        };
    }
    @Test
    public void myAtoi() {
        for (String[] testnums:TEST_NUMS) {
            Assert.assertEquals(Integer.parseInt(testnums[1]),myAtoi.myAtoi(testnums[0]));
        }
    }
}