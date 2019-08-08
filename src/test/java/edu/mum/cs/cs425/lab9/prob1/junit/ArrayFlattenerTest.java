package edu.mum.cs.cs425.lab9.prob1.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() throws Exception {
        arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception {
        arrayFlattener = null;
    }

    @Test
    public void testFlattenArray() {
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] a_out = arrayFlattener.flattenArray(a_in);
        Integer[] expected_a_out = {1, 3, 0, 4, 5, 9};
        boolean areArraysEqual = Arrays.equals(a_out, expected_a_out);
        assertTrue(areArraysEqual);
    }

    @Test
    public void testFlattenArrayNull() {
        int[][] a_in = null;
        Integer[] a_out = arrayFlattener.flattenArray(a_in);
        Integer[] expected_a_out = null;
        boolean areArraysEqual = Arrays.equals(a_out, expected_a_out);
        assertTrue(areArraysEqual);
    }
}
