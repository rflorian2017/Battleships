package com.company.ship;

public class Boat extends Ship {
    private static final int BOAT_SIZE = 2;
    //boat occupies only two spaces
    public Boat() {
        super("", BOAT_SIZE);
    }
}
