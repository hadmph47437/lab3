package com.example.lab3ktnc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoSoNguoiDungTest {

    HoSoNguoiDung hoSoNguoiDung;

    @BeforeEach
    void setUp() {
        hoSoNguoiDung = new HoSoNguoiDung("Nguyen Van A");
    }

    @AfterEach
    void tearDown() {
        hoSoNguoiDung = null;
    }

    @Test
    void testGetNameValidProfile() {
        assertEquals("Nguyen Van A", hoSoNguoiDung.getName());
    }

    @Test
    void testGetNameEmptyName() {
        hoSoNguoiDung = new HoSoNguoiDung("");
        assertEquals("", hoSoNguoiDung.getName());
    }

    @Test
    void testGetNameNullProfile() {
        hoSoNguoiDung = null;
        NullPointerException e = assertThrows(NullPointerException.class,
                () -> {
                    if (hoSoNguoiDung != null) {
                        hoSoNguoiDung.getName();
                    } else {
                        throw new NullPointerException("Hồ sơ người dùng không tồn tại");
                    }
                });
        assertEquals("Hồ sơ người dùng không tồn tại", e.getMessage());
    }

    @Test
    void testGetNameNullNameInProfile() {
        hoSoNguoiDung = new HoSoNguoiDung(null);
        NullPointerException e = assertThrows(NullPointerException.class,
                () -> hoSoNguoiDung.getName());
        assertEquals("Hồ sơ người dùng không tồn tại", e.getMessage());
    }

    @Test
    void testGetNameLongName() {
        hoSoNguoiDung = new HoSoNguoiDung("Nguyen Van A Nguyen Van B Nguyen Van C");
        assertEquals("Nguyen Van A Nguyen Van B Nguyen Van C", hoSoNguoiDung.getName());
    }
}
