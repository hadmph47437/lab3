package com.example.lab3ktnc;

public class TruyXuatPhanTu {
    public int getElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("index nằm ngoài giới hạn của mảng");
        }
        return arr[index];
    }
}
