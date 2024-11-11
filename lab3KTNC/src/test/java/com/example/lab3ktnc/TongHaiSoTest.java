package com.example.lab3ktnc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongHaiSoTest {
    TongHaiSo tongHaiSo;

    @BeforeEach
    void setUp() {
        tongHaiSo = new TongHaiSo();
    }

    @AfterEach
    void tearDown() {
        tongHaiSo = null;
    }

    @Test
    void testTinhTongHaiSoVoiGiaTriBien9999() {
        assertEquals(19998, tongHaiSo.tinhTongHaiSo(9999, 9999));
    }

    @Test
    void testTinhTongHaiSoVoiGiaTriBien10000() {
        assertEquals(20000, tongHaiSo.tinhTongHaiSo(10000, 10000));
    }

    @Test
    void testTinhTongHaiSoVoiGiaTriVuotQuaBien10001() {
        ArithmeticException e = Assertions.assertThrows(ArithmeticException.class,
                () -> tongHaiSo.tinhTongHaiSo(10001, 10000));
        Assertions.assertEquals("Giá trị của a và b phải trong khoảng từ -10000 đến 10000", e.getMessage());
    }

    @Test
    void testTinhTongHaiSoVoiGiaTriAm10001() {
        ArithmeticException e = Assertions.assertThrows(ArithmeticException.class,
                () -> tongHaiSo.tinhTongHaiSo(-10001, 10001));
        Assertions.assertEquals("Giá trị của a và b phải trong khoảng từ -10000 đến 10000", e.getMessage());
    }

    @Test
    void testTinhTongHaiSoVoiGiaTriAm10000() {
        assertEquals(-20000, tongHaiSo.tinhTongHaiSo(-10000, -10000));
    }

    @Test
    void testTinhTongHaiSoVoiGiaTriAm9999() {
        assertEquals(-19998, tongHaiSo.tinhTongHaiSo(-9999, -9999));
    }

    // Các test case cho phân vùng tương đương với int
    @Test
    void testTinhTongHaiSoVoiAvaBLonKhongHopLe() {
        ArithmeticException e = Assertions.assertThrows(ArithmeticException.class,
                () -> tongHaiSo.tinhTongHaiSo(15000, 17000));
        Assertions.assertEquals("Giá trị của a và b phải trong khoảng từ -10000 đến 10000", e.getMessage());
    }

    @Test
    void testTinhTongHaiSoVoiAvaBAmKhongHopLe() {
        ArithmeticException e = Assertions.assertThrows(ArithmeticException.class,
                () -> tongHaiSo.tinhTongHaiSo(-12000, -13000));
        Assertions.assertEquals("Giá trị của a và b phải trong khoảng từ -10000 đến 10000", e.getMessage());
    }

    @Test
    void testTinhTongHaiSoChuoiHopLe() {
        assertEquals(17776, tongHaiSo.tinhTongHaiSo("8888", "8888"));
    }

    @Test
    void testTinhTongHaiSoChuoiKhongPhaiSoNguyen() {
        NumberFormatException e = assertThrows(NumberFormatException.class,
                () -> tongHaiSo.tinhTongHaiSo("10.5", "100"));
        assertEquals("Giá trị nhập vào phải là số nguyên.", e.getMessage());
    }

    @Test
    void testTinhTongHaiSoChuoiKhongHopLe() {
        NumberFormatException e = assertThrows(NumberFormatException.class,
                () -> tongHaiSo.tinhTongHaiSo("abc", "100"));
        assertEquals("Giá trị nhập vào phải là số nguyên.", e.getMessage());
    }
}
