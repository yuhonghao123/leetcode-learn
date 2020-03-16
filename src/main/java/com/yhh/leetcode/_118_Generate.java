package com.yhh.leetcode;

/*给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

        在杨辉三角中，每个数是它左上方和右上方的数的和。

        示例:

        输入: 5
        输出:
        [
        [1],
        [1,1],
        [1,2,1],
        [1,3,3,1],
        [1,4,6,4,1]
        ]*/

import java.util.ArrayList;
import java.util.List;

public class _118_Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list=new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if (j==0||j==i){
                    list.add(1);
                }else {
                    list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        int numRows=5;
        _118_Generate generate=new _118_Generate();
        List<List<Integer>> lists=generate.generate(5);
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j));
            }
            System.out.println();
        }
    }
}
