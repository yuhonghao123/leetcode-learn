package com.yhh.leetcode;

/*给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。



        在杨辉三角中，每个数是它左上方和右上方的数的和。

        示例:

        输入: 3
        输出: [1,3,3,1]*/

import java.util.ArrayList;
import java.util.List;

public class _119_GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists=new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
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
        return lists.get(rowIndex-1);
    }

    public static void main(String[] args) {
        int rowIndex=3;
        _119_GetRow getRow=new _119_GetRow();
        List<Integer> list=getRow.getRow(rowIndex);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
