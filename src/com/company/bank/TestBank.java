package com.company.bank;

public class TestBank {
    public static void main(String[] args) {
        Humo humo = new Humo();
        System.out.println(humo.creditGive());
        System.out.println(humo.giveDollar());
        System.out.println(humo.sellDollar());

        Xalq xalq = new Xalq();
        System.out.println(xalq.creditGive());
        System.out.println(xalq.sellDollar());
        System.out.println(xalq.giveDollar());

        Agrobank agrobank = new Agrobank();
        System.out.println(agrobank.creditGive());
        System.out.println(agrobank.giveDollar());
        System.out.println(agrobank.sellDollar());
    }
}
