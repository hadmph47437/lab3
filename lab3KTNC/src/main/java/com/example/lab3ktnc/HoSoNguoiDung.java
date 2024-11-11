package com.example.lab3ktnc;

public class HoSoNguoiDung {
    private String name;

    public HoSoNguoiDung(String name) {
        this.name = name;
    }
    public String getName() {
        if (name == null) {
            throw new NullPointerException("hs người dùng ko tồn tai");
        }
        return name;
    }
}
