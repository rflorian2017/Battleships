package com.company.Player;

import com.company.ship.Ship;

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
    }

    public void setName(String name) {
        this.PlayerName = name;
    }

    public String getName() {
        return PlayerName;
    }


}
