package com.company.bank;

import java.time.LocalDate;

public abstract class Bank {
    private String name;
    private int cost;
    private LocalDate manufactoryDate;

    public abstract int sellDollar();
    public abstract int giveDollar();
    public abstract int creditGive();
}
