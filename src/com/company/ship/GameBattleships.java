package com.company.ship;

import com.company.Move;
import com.company.Player.Player;

public interface GameBattleships {

    void attack(Move moveToAttack);
    void placeShip(Player p, Ship shipToPlace);
}

