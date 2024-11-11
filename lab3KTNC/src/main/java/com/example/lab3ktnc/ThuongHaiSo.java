package com.example.lab3ktnc;

public class ThuongHaiSo {
    public double chiaHaiSo(int a, int b) {
        if (a < -10000 || a > 10000 || b < -10000 || b > 10000) {
            throw new ArithmeticException("Giá trị của a và b phải trong khoảng từ -10000 đến 10000");
        }
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return (double) a / b;
    }
}
