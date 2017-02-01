package edu.oregonstate.cs361.battleship;

/**
 * Created by michaelhilton on 1/26/17.
 */
public class BattleshipModel {
    
    private BattleShip[] playerBtShips, computerBtShips;
    private shots[] pHits, pMiss, cHits, cMiss;
    
    //Hits
    public BattleshipModel(battleShip[] playerBtShips, battleShip[] computerBtShips, shots[] pHits, shots[] pMiss, shots[] cHits, shots[] cMiss) {
        this.playerBtShips = playerBtShips;
        this.computerBtShips = computerBtShips;
        this.pHits = pHits;
        this.pMiss = pMiss;
        this.cHits = cHits;
        this.cMiss = cMiss;
    }
    
    public battleShip[] getplayerBtShips() {
        return playerBtShips;
    }
    public battleShip[] getcomputerBtShips() {
        return computerBtShips;
    }
    public battleShip[] getpHits() {
        return pHits;
    }
    public battleShip[] getpMiss() {
        return pMiss;
    }
    public battleShip[] getcHits() {
        return cHits;
    }
    public battleShip[] getcMiss() {
        return cMiss;
    }
}
public class BattleShip {
    //Battleship
    this.name = name
    this.length = length;
    this.start = start;
    this.end = end;
}
