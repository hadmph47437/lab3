package com.example.lab3ktnc;

import java.util.List;

public class TrungBinhCong {

    public double tinhTrungBinhCong(List<Integer> danhSach) {
        // Kiểm tra danh sách trống
        if (danhSach == null || danhSach.isEmpty()) {
            throw new ArithmeticException("Không thể tính trung bình cộng của danh sách trống");
        }

        // Tính tổng các phần tử trong danh sách
        double tong = 0;
        for (int so : danhSach) {
            tong += so;
        }

        // Trả về kết quả trung bình cộng
        return tong / danhSach.size();
    }
}

