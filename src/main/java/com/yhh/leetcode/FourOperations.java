package com.yhh.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//加减
public class FourOperations {
    public int fourOperations(String nums){
        int sum=0;
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack1=new Stack<>();
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i)=='+'||nums.charAt(i)=='-'){
                stack1.push(nums.charAt(i));
            }else {
                stack.push(nums.charAt(i));
            }
        }
        while (!stack1.isEmpty()){
            int a=stack.pop()-'0';
            int b=stack.pop()-'0';
            switch (stack1.pop()){
                case '+':sum=a+b;break;
                case '-':sum=b-a;break;
            }
            String str=String.valueOf(sum);
            char[] csum=str.toCharArray();
            char ss = '0';
            for (int i = 0; i < csum.length; i++) {
                ss=csum[i];
            }
            stack.push(ss);
        }
        return sum;
    }

    public static void main(String[] args) {
        String nums="1+4-3+5+5";
        FourOperations fourOperations=new FourOperations();
        int sum=fourOperations.fourOperations(nums);
        System.out.println(sum);
    }
}
