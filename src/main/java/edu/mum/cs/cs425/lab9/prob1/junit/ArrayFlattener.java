package edu.mum.cs.cs425.lab9.prob1.junit;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public Integer[] flattenArray(int[][] a_in) {
        if (a_in == null)
            return null;
        List<Integer> list = new ArrayList<Integer>();
        for (int[] arr : a_in) {
            for (int i : arr) {
                list.add(i);
            }
        }
        return (Integer[]) list.toArray(new Integer[list.size()]);
    }

}
