package com.company;

import com.company.Game.Game;
import com.company.Player.Player;
import com.company.utils.NumbersMap;

import java.util.HashMap;

public class PlayGames {

    public static void main(String[] args) {
	// write your code here
        Board board = new Board(10,10);
        int x = 2;
        char letter = (char)('A' + x);
        //System.out.println(Utility.showLetterInAlphabet(-30));
        //System.out.println(board.displayBoard());

        Player p1 = new Player("Petruta");
        Player p2 = new Player("Roby");
        Game g1 = new Game();

        //TODO: p1.placeShips()
        // TODO: Games provides the player's list of ships and allows him/her to select it



//
//
        g1.startGame(p1,p2);
        System.out.println(g1.listShips(p1));

        g1.askPlayerWhichShipToPlace(p1, 1);




        //

//        for (Player player: g1.getPlayers()) {
//            System.out.println(player.getName());
//        }
//
//        Player p3 = new Player("Petruta");
//        Player p4 = new Player("Rolly");
//        g1.startGame(p3,p4);
//        System.out.println(p1);
//        System.out.println(p3);
//        if(p1.equals(p3)) {
//            System.out.println("true");
//        }
//        else {
//            System.out.println(false);
//        }
//
//        for (Player player: g1.getPlayers()) {
//            System.out.println(player.getName());
//        }

    }
}
