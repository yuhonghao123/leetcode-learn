package com.yhh.leetcode;

/*给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

        你可以假设除了整数 0 之外，这个整数不会以零开头。

        示例 1:

        输入: [1,2,3]
        输出: [1,2,4]
        解释: 输入数组表示数字 123。
        示例 2:

        输入: [4,3,2,1]
        输出: [4,3,2,2]
        解释: 输入数组表示数字 4321。*/

public class _66_PlusOne {
    public int[] plusOne(int[] digits) {
        /*StringBuilder str=new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            str.append(digits[i]);
        }
        long a=Long.parseLong(str.toString());
        a=a+1;
        String string=String.valueOf(a);
        for (int i = 0; i < string.length(); i++) {
            char c=string.charAt(i);
            if (string.length()>digits.length){
                digits=new int[digits.length+1];
                digits[i]=c-'0';
            }else {
                digits[i]=c-'0';
            }
        }
        return digits;*/

        for (int i = digits.length-1; i >=0; i--) {
            if (digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }else {
                digits[i]=0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


    public static void main(String[] args) {
        int[] a={9,9};
        int[] b;
        _66_PlusOne plusOne=new _66_PlusOne();
        b=plusOne.plusOne(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+"\t");
        }
    }
}
