package com.company.utils;

import java.util.ArrayList;
import java.util.List;

public class NumbersMap {
    private List<Integer> keys;
    private List<Integer> values;

    public NumbersMap() {
        keys = new ArrayList<Integer>();
        values = new ArrayList<Integer>();
    }

    public void put(int key, int value) {
        keys.add(key);
        values.add(value);
    }

    public int getValueOfKey(int key) {
        return values.get(keys.indexOf(key));
    }
}
