package com.example.lab3ktnc;

public class TongHaiSo {
    public boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public long tinhTongHaiSo(String a, String b) {
        if (!isInteger(a) || !isInteger(b)) {
            throw new NumberFormatException("Giá trị nhập vào phải là số nguyên.");
        }

        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        if (intA < -10000 || intA > 10000 || intB < -10000 || intB > 10000) {
            throw new ArithmeticException("Giá trị của a và b phải trong khoảng từ -10000 đến 10000");
        }
        return (long) intA + intB;
    }

    // Phương thức tinhTongHaiSo nhận đầu vào là số nguyên
    public long tinhTongHaiSo(int a, int b) {
        if (a < -10000 || a > 10000 || b < -10000 || b > 10000) {
            throw new ArithmeticException("Giá trị của a và b phải trong khoảng từ -10000 đến 10000");
        }
        return (long) a + b;
    }
}
