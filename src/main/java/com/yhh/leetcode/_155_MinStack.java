package com.yhh.leetcode;

/*设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

        push(x) -- 将元素 x 推入栈中。
        pop() -- 删除栈顶的元素。
        top() -- 获取栈顶元素。
        getMin() -- 检索栈中的最小元素。
        示例:

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();   --> 返回 -3.
        minStack.pop();
        minStack.top();      --> 返回 0.
        minStack.getMin();   --> 返回 -2.*/

import java.util.Stack;

public class _155_MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public _155_MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (!minStack.isEmpty()){
            int top=minStack.peek();
            if (x<top){
                minStack.push(x);
            }
        }else {
            minStack.push(x);
        }
    }

    public void pop() {
        int pop=stack.pop();
        int top=minStack.peek();
        if (pop==top){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        _155_MinStack minStack=new _155_MinStack();
        minStack.push(12);
        minStack.push(34);
        minStack.push(-12);
        minStack.push(55);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
