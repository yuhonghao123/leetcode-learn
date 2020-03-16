package com.yhh.leetcode;

/*给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

        说明：本题中，我们将空字符串定义为有效的回文串。

        示例 1:

        输入: "A man, a plan, a canal: Panama"
        输出: true
        示例 2:

        输入: "race a car"
        输出: false*/

public class _125_IsPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                str1.append(s.charAt(i));
            }
        }
        for (int i = str1.length()-1;i >=0; i--) {
            str2.append(str1.charAt(i));
        }
        String str_a=str1.toString();
        String str_b=str2.toString();
        if (str_a.equalsIgnoreCase(str_b)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        _125_IsPalindrome isPalindrome=new _125_IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(s));
    }
}
