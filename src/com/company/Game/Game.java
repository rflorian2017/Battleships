package com.company.Game;

import com.company.Board;
import com.company.Move;
import com.company.Player.Player;
import com.company.ship.GameBattleships;
import com.company.ship.Ship;
import com.company.utils.Constants;
import com.company.utils.NumbersMap;

import java.util.ArrayList;
import java.util.List;

public class Game implements GameBattleships {
    private int currentRound;
    private List<Player> players;
    private NumbersMap indexOfShipsMap;

    private Board firstPlayerOwnBoard;
    private Board firstPlayerEnemyBoard;
    private Board secondPlayerOwnBoard;
    private Board secondPlayerEnemyBoard;

    //default constructor
    public Game() {
        currentRound = 1;
        players = new ArrayList<Player>();
    }

    public void startGame(Player p1, Player p2) {
        if (!players.contains(p1)) {
            players.add(p1);
        }

        if (!players.contains(p2)) {
            players.add(p2);
        }

        firstPlayerOwnBoard = new Board(Constants.NUMBER_OF_BOARD_LINES,
                Constants.NUMBER_OF_BOARD_COLUMNS);
        firstPlayerEnemyBoard = new Board(Constants.NUMBER_OF_BOARD_LINES,
                Constants.NUMBER_OF_BOARD_COLUMNS);
        secondPlayerOwnBoard = new Board(Constants.NUMBER_OF_BOARD_LINES,
                Constants.NUMBER_OF_BOARD_COLUMNS);
        secondPlayerEnemyBoard = new Board(Constants.NUMBER_OF_BOARD_LINES,
                Constants.NUMBER_OF_BOARD_COLUMNS);
    }

    @Override
    public void attack(Move moveToAttack) {

    }


    @Override
    public void placeShip(Player p, Ship shipToPlace) {

    }

    public Ship askPlayerWhichShipToPlace(Player player, int index) {
        return player
                .getShips()
                .get(indexOfShipsMap.getValueOfKey(index));
    }

    public String listShips(Player player) {
        indexOfShipsMap = new NumbersMap();
        String toReturn = "";
        List<Ship> shipList = player.getShips();
        //1 Boat
        //2 Frigate
        //3 Frigate
        int counter = 1;
        for (Ship ship : shipList) {
            if(!ship.isAlreadyPlaced()) {
                indexOfShipsMap.put(counter, shipList.indexOf(ship));
                toReturn += counter + ". " + ship.getClass().getSimpleName() + "\n";
                counter++;
            }
        }
        return toReturn;
    }

    public String getGameStatistics() {
        return null;
    }


    //TODO: Clear player ship coordinates at end of round
    public List<Player> getPlayers() {
        return players;
    }
}
