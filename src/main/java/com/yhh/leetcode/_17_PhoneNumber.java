package com.yhh.leetcode;

/*给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

        给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

        示例:

        输入："23"
        输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].*/


import java.util.ArrayList;
import java.util.List;

public class _17_PhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> list1=new ArrayList<>();
        StringBuilder builder=new StringBuilder();
        if (!digits.equals("")){
            backString(0,digits,builder,list1);
        }
        return list1;

    }
    private void backString(int i,String digits,StringBuilder builder,List<String> list1){
        if (builder.length()==digits.length()){
            list1.add(builder.toString());
            return;
        }
        String num=getString(digits.charAt(i));
        for (int j = 0; j < num.length(); j++) {
            builder.append(num.charAt(j));
            backString(i+1,digits,builder,list1);
            builder.deleteCharAt(builder.length()-1);
        }
    }
    private String getString(char ch){
        switch(ch){
            case '2':return "abc";
            case '3':return "def";
            case '4':return "ghi";
            case '5':return "jkl";
            case '6':return "mno";
            case '7':return "pqrs";
            case '8':return "tuv";
            case '9':return "wxyz";
            default:return "";
        }
    }

    public static void main(String[] args) {
        String digits="234";
        _17_PhoneNumber phoneNumber=new _17_PhoneNumber();
        List<String> num=phoneNumber.letterCombinations(digits);
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
    }
}
