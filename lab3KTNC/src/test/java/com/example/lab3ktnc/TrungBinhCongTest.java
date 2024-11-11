package com.example.lab3ktnc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TrungBinhCongTest {

    TrungBinhCong trungBinhCong;

    @BeforeEach
    void setUp() {
        trungBinhCong = new TrungBinhCong();
    }

    @AfterEach
    void tearDown() {
        trungBinhCong = null;
    }

    @Test
    void testTinhTrungBinhCongDanhSachTrong() {
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> trungBinhCong.tinhTrungBinhCong(Collections.emptyList()));
        assertEquals("Không thể tính trung bình cộng của danh sách trống", e.getMessage());
    }

    @Test
    void testTinhTrungBinhCongDanhSachCoMotPhanTu() {
        assertEquals(10.0, trungBinhCong.tinhTrungBinhCong(Collections.singletonList(10)));
    }

    @Test
    void testTinhTrungBinhCongDanhSachCoNhieuPhanTuDuong() {
        assertEquals(5.0, trungBinhCong.tinhTrungBinhCong(Arrays.asList(2, 4, 6, 8)));
    }

    @Test
    void testTinhTrungBinhCongDanhSachCoNhieuPhanTuAm() {
        assertEquals(-5.0, trungBinhCong.tinhTrungBinhCong(Arrays.asList(-2, -4, -6, -8)));
    }

    @Test
    void testTinhTrungBinhCongDanhSachCoPhanTuDuongVaAm() {
        assertEquals(0.0, trungBinhCong.tinhTrungBinhCong(Arrays.asList(-5, 5, -10, 10)));
    }

    @Test
    void testTinhTrungBinhCongDanhSachCoGiaTriLon() {
        assertEquals(5000.0, trungBinhCong.tinhTrungBinhCong(Arrays.asList(10000, 0, 5000)));
    }
}
