package edu.mum.cs.cs425.lab9.prob2.junitmockito;

import edu.mum.cs.cs425.lab9.prob2.junitmockito.junitmockito.service.IArrayReversorService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

public class ArrayReverserTest {
    private ArrayReverser arrayReverser;
    private IArrayReversorService arrayReversorService = mock(IArrayReversorService.class);

    @Before
    public void setUp() throws Exception {
        arrayReverser = new ArrayReverser(arrayReversorService);
    }

    @After
    public void tearDown() throws Exception {
        arrayReverser = null;
    }

    @Test
    public void testArrayReverser() {
        int[][] a_in = new int[][]{{1, 3}, {0}, {4, 5, 9}};
        when(arrayReversorService.flattenArray(a_in)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});
        int[] actual = arrayReverser.reverseArray(a_in);
        int[] expected = new int[]{9, 5, 4, 0, 3, 1};
        assertArrayEquals(expected, actual);
        verify(arrayReversorService).flattenArray(a_in);
    }
}
