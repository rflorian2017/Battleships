package com.company.Player;

import com.company.ship.*;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String PlayerName;
    private int Score;
    private List<Ship> ships;

    public List<Ship> getShips() {
        return ships;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public Player(String name) {
        PlayerName = name;
        ships = new ArrayList<Ship>();
        ships.add( new Boat());
        ships.add( new Fregate());
        ships.add( new Fregate());
        ships.add( new Carrier());
        ships.add( new Destroyer());
    }

    public void setName(String name) {
        this.PlayerName = name;
    }

    public String getName() {
        return PlayerName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Player) {
            /*
            cand apelam din exterior, pe un obiect player aceasta metoda
            si avem ca parametru un alt obiect Player, ele sunt egale daca au acelasi nume
             */
            if(this.getName().equals( ((Player)obj).getName() ) ) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
