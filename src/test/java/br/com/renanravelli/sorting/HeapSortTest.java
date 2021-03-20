package br.com.renanravelli.sorting;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HeapSortTest {

    @Test
    public void validarOrdem() {
        int[] vetor = {10, 4, 1, 6, 7, 3, 8, 2, 9, 5};
        HeapSort heapSort = new HeapSort();
        heapSort.sorting(vetor);
        System.out.println(Arrays.toString(Arrays.stream(vetor).toArray()));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, vetor);
    }
}
