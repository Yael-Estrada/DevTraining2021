package com.sngular.devTrining2021.test.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestsCasesAlgorithmName {
    @Test
    public void test() {
        assertEquals("Test value {1,2,3,4,3,2,1}",3,AlgorithmName.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals("Test value {1,2,3,4,3,2,1}",1,AlgorithmName.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals("Test value {1,2,3,4,3,2,1}",-1,AlgorithmName.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals("Test value {1,2,3,4,3,2,1}",3,AlgorithmName.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals("Test value {1,2,3,4,3,2,1}",-1,AlgorithmName.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals("Test value {1,2,3,4,3,2,1}",1,AlgorithmName.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals("Test value {1,2,3,4,3,2,1}",6,AlgorithmName.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}