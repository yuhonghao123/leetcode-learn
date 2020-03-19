package com.yhh.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddTwoNumbers {

    public String addTwoNumbers(String num1, String num2) {

        List<Integer> n1 = new ArrayList<>();
        for (int i = 0; i < num1.length(); i ++) {
            n1.add(Integer.parseInt(Character.toString(num1.charAt(i))));
        }

        List<Integer> n2 = new ArrayList<>();
        for (int i = 0; i < num2.length(); i ++) {
            n2.add(Integer.parseInt(Character.toString(num2.charAt(i))));
        }

        List<Integer> l = addTwoNumbers(n1, n2);

        return l.stream().map(i ->i.toString()).collect(Collectors.joining(""));

    }

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
        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();

        System.out.println(addTwoNumbers.addTwoNumbers("1223", "22922"));
//        System.out.println(addTwoNumbers.addTwoNumbers("-1223", "22922"));
        System.out.println(addTwoNumbers.addTwoNumbers("0", "22922"));
        System.out.println(addTwoNumbers.addTwoNumbers("1223", "0"));
        System.out.println(addTwoNumbers.addTwoNumbers("9999999999999999999999999999999999999999", "22922"));
        System.out.println(addTwoNumbers.addTwoNumbers("0", "0"));
        System.out.println(addTwoNumbers.addTwoNumbers("1234567890", "987654321"));

//        List<Integer> num1=new ArrayList<>();
//        num1.add(1);
//        num1.add(2);
//        num1.add(3);
//        num1.add(4);
//        List<Integer> num2=new ArrayList<>();
//        num2.add(1);
//        num2.add(2);
//        num2.add(3);
//        List<Integer> sum=new ArrayList<>();
//
//        sum=addTwoNumbers.addTwoNumbers(num1,num2);
//        for (int i = 0; i < sum.size(); i++) {
//            System.out.print(sum.get(i)+"\t");
//        }
    }
}
