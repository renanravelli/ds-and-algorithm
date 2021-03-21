package br.com.renanravelli.binary.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BinarySearchIndexTest {

    @Test
    public void validarIndex() {
        IntStream vetor = IntStream.range(1, 101);// 100 elementos;
        BinarySearchIndex searchIndex = new BinarySearchIndex();
        int index = searchIndex.search(vetor.toArray(), 56);
        Assert.assertEquals(55, index);
    }

}
