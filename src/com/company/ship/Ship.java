package com.company.ship;

import com.company.model.Coordinate;

import java.util.ArrayList;
import java.util.List;

abstract public class Ship {
    private String name;
    private int size;
    private boolean alreadyPlaced;
    //retains list of coordinates
    private List<Coordinate> coordinateList;

    /*final static int boat =2;
    final static int frigate =3;
    final static int destroyer =4;
    final static int carrier =5;*/

    public Ship (String name, int size){
        this.name=name;
        this.size=size;
        coordinateList = new ArrayList<Coordinate>();
        this.alreadyPlaced = false;
    }

    public void addCoordinateToList(Coordinate coordinate1) {
        coordinateList.add(coordinate1);
    }

    public void clearShipCoordinateList() {
        coordinateList = new ArrayList<Coordinate>();
        alreadyPlaced = false;
    }

    public List<Coordinate> getCoordinateList() {
        return coordinateList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAlreadyPlaced() {
        return alreadyPlaced;
    }

    public void setAlreadyPlaced(boolean alreadyPlaced) {
        this.alreadyPlaced = alreadyPlaced;
    }
}
