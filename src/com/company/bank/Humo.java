package com.company.bank;

public class Humo extends Bank{

    @Override
    public int sellDollar() {
        return 1100;
    }

    @Override
    public int giveDollar() {
        return 1098;
    }

    @Override
    public int creditGive() {
        return 3000000;
    }
}
