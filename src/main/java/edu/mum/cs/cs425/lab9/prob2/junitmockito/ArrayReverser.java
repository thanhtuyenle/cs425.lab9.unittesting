package edu.mum.cs.cs425.lab9.prob2.junitmockito;

import edu.mum.cs.cs425.lab9.prob2.junitmockito.junitmockito.service.IArrayReversorService;

public class ArrayReverser {
    private IArrayReversorService arrayReversorService;

    public ArrayReverser(IArrayReversorService arrayReversorService) {
        this.arrayReversorService = arrayReversorService;
    }
    public int[] reverseArray(int[][] a_in) {
        //int[] a_flat = new int[]{1, 3, 0, 4, 5, 9};
        int[] a_flat = arrayReversorService.flattenArray(a_in);
        if (a_flat == null)
            return null;
        int i = 0;
        int j = a_flat.length - 1;
        while (i < j) {
            int temp = a_flat[i];
            a_flat[i] = a_flat[j];
            a_flat[j] = temp;
            i++;
            j--;
        }
        return a_flat;
    }
}
