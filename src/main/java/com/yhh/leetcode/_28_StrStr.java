package com.yhh.leetcode;

/*实现 strStr() 函数。

        给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

        示例 1:

        输入: haystack = "hello", needle = "ll"
        输出: 2
        示例 2:

        输入: haystack = "aaaaa", needle = "bba"
        输出: -1*/


public class _28_StrStr {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)){
            return 0;
        }
        for (int i = 0; i <=(haystack.length()-needle.length()); i++) {
            String str=haystack.substring(i,i+needle.length());
            if (str.equals(needle)){
                return i;
            }
        }
        if (needle.equals("")){
            return 0;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String haystack="mississippi";
        String needle="pi";
        _28_StrStr strStr=new _28_StrStr();
        int a=strStr.strStr(haystack,needle);
        System.out.println(a);
    }
}
