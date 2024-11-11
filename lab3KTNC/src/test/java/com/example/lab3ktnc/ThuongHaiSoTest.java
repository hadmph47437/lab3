package com.example.lab3ktnc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThuongHaiSoTest {

    ThuongHaiSo thuongHaiSo;

    @BeforeEach
    void setUp() {
        thuongHaiSo = new ThuongHaiSo();
    }

    @AfterEach
    void tearDown() {
        thuongHaiSo = null;
    }



    // Các test case cho giá trị biên
    @Test
    void testChiaHaiSoVoiGiaTriBienDuong() {
        assertEquals(1.0, thuongHaiSo.chiaHaiSo(10000, 10000));
    }

    @Test
    void testChiaHaiSoVoiGiaTriBienAm() {
        assertEquals(1.0, thuongHaiSo.chiaHaiSo(-10000, -10000));
    }

    @Test
    void testChiaHaiSoVuotQuaBienDuong() {
        ArithmeticException e = Assertions.assertThrows(ArithmeticException.class, () -> thuongHaiSo.chiaHaiSo(10001, 10000));
        assertEquals("Giá trị của a và b phải trong khoảng từ -10000 đến 10000", e.getMessage());
    }

    @Test
    void testChiaHaiSoVuotQuaBienAm() {
        ArithmeticException e = Assertions.assertThrows(ArithmeticException.class, () -> thuongHaiSo.chiaHaiSo(-10001, -10000));
        assertEquals("Giá trị của a và b phải trong khoảng từ -10000 đến 10000", e.getMessage());
    }

    // Các test case cho phân vùng tương đương
    @Test
    void testChiaHaiSoDuong() {
        assertEquals(2.0, thuongHaiSo.chiaHaiSo(10, 5));
    }

    @Test
    void testChiaHaiSoAm() {
        assertEquals(2.0, thuongHaiSo.chiaHaiSo(-10, -5));
    }

    @Test
    void testChiaSoAmChoSoDuong() {
        assertEquals(-2.0, thuongHaiSo.chiaHaiSo(-10, 5));
    }

    @Test
    void testChiaSoDuongChoSoAm() {
        assertEquals(-2.0, thuongHaiSo.chiaHaiSo(10, -5));
    }

    @Test
    void testChiaSoKhongChoSoDuong() {
        assertEquals(0.0, thuongHaiSo.chiaHaiSo(0, 10));
    }


    @Test
    void testChiaChoKhong() {
        ArithmeticException e = Assertions.assertThrows(ArithmeticException.class, () -> thuongHaiSo.chiaHaiSo(10, 0));
        assertEquals("Không thể chia cho 0", e.getMessage());
    }

}
