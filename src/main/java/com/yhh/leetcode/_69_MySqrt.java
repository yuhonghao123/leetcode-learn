package com.yhh.leetcode;

/*实现 int sqrt(int x) 函数。

        计算并返回 x 的平方根，其中 x 是非负整数。

        由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

        示例 1:

        输入: 4
        输出: 2
        示例 2:

        输入: 8
        输出: 2
        说明: 8 的平方根是 2.82842...,
             由于返回类型是整数，小数部分将被舍去。*/


public class _69_MySqrt {
    public float mySqrt(int x) {
        int a=(int)(Math.sqrt(x));
        return a;
    }


    double epsilon = 0.000001;

    public double sqrt(double a) {

        double low = 0;
        double high = a;

        double x = (low + high) / 2;
        double delta = Math.abs(x*x - a);

        while (delta > epsilon) {
            if (x * x > a) {
                high = x;
            } else if (x * x < a) {
                low = x;
            } else {
                return x;
            }
            x = (low + high) / 2;
            delta = Math.abs(x*x - a);
        }

        return x;
    }

    public static void main(String[] args) {
        int x=2;
        _69_MySqrt mySqrt=new _69_MySqrt();
        System.out.println(mySqrt.sqrt(3));
    }
}
