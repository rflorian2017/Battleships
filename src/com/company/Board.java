package com.company;

import com.company.utils.Utility;

public class Board {

    private int lines;
    private int columns;

    private String[][] gameBoard;

    public Board(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
        initBoard(lines, columns);
    }

    private void initBoard(int lines, int columns) {
        gameBoard = new String[lines][columns];
    }

    public void initBoard() {
        gameBoard = new String[this.lines][this.columns];
    }

    public String displayBoard() {
        String displayString = "";
        String emptyCell = Utility.putSpaces(1) +
                "|_|" +
                Utility.putSpaces(1);
        displayString = Utility.putSpaces(2) +
                Utility.showNumbers(columns, 2) + "\n";
        for (int i = 0; i < lines; i++) {
            displayString += Utility.showLetterInAlphabet(i+1) + " ";
            for (int j = 0; j < columns; j++) {
                displayString += emptyCell;
                //displayString = displayString + emptyCell + " ";
            }
            displayString += "\n";
        }
        return displayString;
    }
}
