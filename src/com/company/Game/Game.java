package com.company.Game;

import com.company.Board;
import com.company.Move;
import com.company.Player.Player;
import com.company.ship.GameBattleships;
import com.company.ship.Ship;

import java.util.List;

public class Game implements GameBattleships {
    private int currentRound;
    private List<Player> players;
    private List<Ship> ships;
    private Board firstPlayerOwnBoard;
    private Board firstPlayerEnemyBoard;
    private Board secondPlayerOwnBoard;
    private Board secondPlayerEnemyBoard;

    //default constructor
    public Game() {
        currentRound =1;
    }

    public void startGame(Player p1, Player p2) {
        //TODO: Check in the future if the player does not already exist in the list
        players.add(p1);
        players.add(p2);

        firstPlayerEnemyBoard.initBoard();
        firstPlayerOwnBoard.initBoard();
        secondPlayerEnemyBoard.initBoard();
        secondPlayerOwnBoard.initBoard();


    }

    @Override
    public void attack(Move moveToAttack) {

    }

    @Override
    public void placeShip(Ship shipToPlace) {

    }

    public String getGameStatistics() {
        return null;
    }
}
