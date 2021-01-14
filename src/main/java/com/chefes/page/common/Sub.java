package com.chefes.page.common;

public enum Sub {
    ONE(10), TWELVE(100);
    private int price;

    Sub(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

}
