package com.yhh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public List<Integer> addTwoNumbers(List<Integer> num1, List<Integer> num2){
        if (num1.size()>num2.size()){
            List<Integer> num3=new ArrayList<>();
            for (int i = 0; i < num1.size()-num2.size(); i++) {
                    num3.add(0);
            }
            for (int i = 0; i < num2.size(); i++) {
                num3.add(num2.get(i));
            }
            num2.clear();
            num2.addAll(num3);
        }
        if (num2.size()>num1.size()){
            List<Integer> num3=new ArrayList<>();
            for (int i = 0; i < num2.size()-num1.size(); i++) {
                num3.add(0);
            }
            for (int i = 0; i < num1.size(); i++) {
                num3.add(num1.get(i));
            }
            num1.clear();
            num1.addAll(num3);
        }
        int cre=0;
        List<Integer> list=new ArrayList<>();
        List<Integer> sum=new ArrayList<>();
        int i=num1.size()-1;
        while (i>=0){
            int num1_a=num1.get(i);
            int num2_a=num2.get(i);
            int x=(num1_a+num2_a+cre)%10;
            cre=(num1_a+num2_a+cre)/10;
            list.add(x);
            i--;
        }
        if (cre!=0){
            list.add(cre);
        }
        for (int j = list.size()-1; j >=0; j--) {
            sum.add(list.get(j));
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> num1=new ArrayList<>();
        num1.add(9);
        num1.add(9);
        num1.add(9);
        num1.add(9);
        List<Integer> num2=new ArrayList<>();
        num2.add(9);
        num2.add(9);
        num2.add(9);
        List<Integer> sum=new ArrayList<>();
        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();
        sum=addTwoNumbers.addTwoNumbers(num1,num2);
        for (int i = 0; i < sum.size(); i++) {
            System.out.print(sum.get(i)+"\t");
        }
    }
}
