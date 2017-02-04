package edu.oregonstate.cs361.battleship;

/**
 * Created by michaelhilton on 1/26/17.
 */
public class BattleshipModel {
    
    private BattleShip[] playerBtShips, computerBtShips;
    private shots[] pHits, pMiss, cHits, cMiss;
    
    //Hits
    public BattleshipModel(BattleShip[] playerBtShips, BattleShip[] computerBtShips, shots[] pHits, shots[] pMiss, shots[] cHits, shots[] cMiss) {
        this.playerBtShips = playerBtShips;
        this.computerBtShips = computerBtShips;
        this.pHits = pHits;
        this.pMiss = pMiss;
        this.cHits = cHits;
        this.cMiss = cMiss;
    }

    public BattleShip[] getplayerBtShips() {
        return this.playerBtShips;
    }
    public BattleShip[] getcomputerBtShips() {
        return this.computerBtShips;
    }
    public shots[] getpHits() {
        return this.pHits;
    }
    public shots[] getpMiss() {
        return this.pMiss;
    }
    public shots[] getcHits() {
        return this.cHits;
    }
    public shots[] getcMiss() {
        return this.cMiss;
    }
}
public class BattleShip {

    private String name;
    private int length, start, end;

    //Battleship
    public BattleShip(String name, int length, int start, int end) {
        this.name = name
        this.length = length;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return this.name;
    }
    public int getLength() {
        return this.length;
    }
    public int getStart() {
        return this.start;
    }
    public int getEnd() {
        return this.end;
    }
}
