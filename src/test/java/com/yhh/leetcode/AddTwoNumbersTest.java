package com.yhh.leetcode;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers adder = new AddTwoNumbers();

    private static String[][] TEST_CASES;

    @Before
    public void setup() {
        TEST_CASES = new String[][] {
            {"123", "321", "444"},
            {"123", "322", "445"},
            {"999999999999999", "123", "1000000000000122"},
            {"999999999999999", "124", "1000000000000123"},
            {"999999999999999", "999999999999999", "1999999999999998"},
            {"999999999999999", "124", "1000000000000123"},
            {"999999999999999", "124", "1000000000000123"},
            {"999999999999999", "124", "1000000000000123"},
        };
    }

    @Test
    public void testBatch() {
        for (String[] testCase : TEST_CASES) {

            Assert.assertEquals(testCase[2], adder.addTwoNumbers(testCase[0], testCase[1]));
        }

    }
}