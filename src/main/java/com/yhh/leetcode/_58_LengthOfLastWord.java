package com.yhh.leetcode;

/*给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。

        如果不存在最后一个单词，请返回 0 。

        说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。

        示例:

        输入: "Hello World"
        输出: 5*/

public class _58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        StringBuilder str=new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            char c=s.charAt(i);
            String s1=String.valueOf(c);
            if (s1.equals(" ")){
                return str.length();
            }else {
                str.append(s1);
            }
        }
        return str.length();
    }

    public static void main(String[] args) {
        String str="a ";
        _58_LengthOfLastWord lengthOfLastWord=new _58_LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord(str));
    }
}
