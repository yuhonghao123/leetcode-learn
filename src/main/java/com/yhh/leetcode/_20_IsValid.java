package com.yhh.leetcode;

/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

        有效字符串需满足：

        左括号必须用相同类型的右括号闭合。
        左括号必须以正确的顺序闭合。
        注意空字符串可被认为是有效字符串。

        示例 1:

        输入: "()"
        输出: true*/


import java.util.Stack;

public class _20_IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char str=s.charAt(i);
            if (str=='('){
                stack.push(')');
            }else if(str=='{'){
                stack.push('}');
            }else if(str=='['){
                stack.push(']');
            }else if (stack.empty()){
               return false;
            }else if (str!=stack.pop()){
                return false;
            }
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        _20_IsValid isValid=new _20_IsValid();
        String str="()";
        System.out.println(isValid.isValid(str));
    }
}
