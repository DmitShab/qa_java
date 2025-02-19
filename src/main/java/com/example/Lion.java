package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    private BigCats feline;

    public Lion(String sex, BigCats feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
            this.feline = feline;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
            this.feline = feline;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}