package com.yhh.leetcode;

/*给定两个二进制字符串，返回他们的和（用二进制表示）。

        输入为非空字符串且只包含数字 1 和 0。

        示例 1:

        输入: a = "11", b = "1"
        输出: "100"
        示例 2:

        输入: a = "1010", b = "1011"
        输出: "10101"*/

import java.math.BigInteger;

public class _67_AddBinary {
    public String addBinary(String a, String b) {
        BigInteger int_a=new BigInteger(a,2);
        BigInteger int_b=new BigInteger(b,2);
        BigInteger sum = int_a.add(int_b);
        //int_a.add(int_b);
        String str=sum.toString(2);
        return str;
    }

    public static void main(String[] args) {
        String a="1010",b="1011";
        _67_AddBinary addBinary=new _67_AddBinary();
        System.out.println(addBinary.addBinary(a,b));
    }
}
