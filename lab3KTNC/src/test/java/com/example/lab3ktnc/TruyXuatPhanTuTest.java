package com.example.lab3ktnc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruyXuatPhanTuTest {

    TruyXuatPhanTu truyXuatPhanTu;
    int[] testArray;

    @BeforeEach
    void setUp() {
        truyXuatPhanTu = new TruyXuatPhanTu();
        testArray = new int[]{1, 2, 3, 4, 5};
    }

    @AfterEach
    void tearDown() {
        truyXuatPhanTu = null;
        testArray = null;
    }

    @Test
    void testGetElementAtIndexWithinBounds() {
        assertEquals(3, truyXuatPhanTu.getElementAtIndex(testArray, 2));
    }

    @Test
    void testGetElementAtIndexFirstElement() {
        assertEquals(1, truyXuatPhanTu.getElementAtIndex(testArray, 0));
    }

    @Test
    void testGetElementAtIndexLastElement() {
        assertEquals(5, truyXuatPhanTu.getElementAtIndex(testArray, 4));
    }

    @Test
    void testGetElementAtIndexNegativeIndex() {
        IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class,
                () -> truyXuatPhanTu.getElementAtIndex(testArray, -1));
        assertEquals("index nằm ngoài giới hạn của mảng", e.getMessage());
    }

    @Test
    void testGetElementAtIndexOutOfBounds() {
        IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class,
                () -> truyXuatPhanTu.getElementAtIndex(testArray, 5));
        assertEquals("index nằm ngoài giới hạn của mảngg", e.getMessage());
    }
    
}
