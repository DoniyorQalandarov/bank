package com.company.bank;

public class Agrobank extends Bank{
    @Override
    public int sellDollar() {
        return 1099;
    }

    @Override
    public int giveDollar() {
        return 1097;
    }

    @Override
    public int creditGive() {
        return 8000000;
    }
}
