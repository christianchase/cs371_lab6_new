package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

/**
 * Created by chasec18 on 10/12/2016.
 */
public class PigGameState extends GameState {

    int playerID;
    int player0Score;
    int player1Score;
    int tempScore;
    int dieValue;

    public PigGameState(){
        super();
        playerID = 0;
        player0Score = 0;
        player1Score = 0;
        tempScore = 0;
        dieValue = 0;
    }
    public PigGameState(PigGameState p){
        super();
        playerID = p.getPlayerID();
        player0Score = p.getPlayer0Score();
        player1Score = p.getPlayer1Score();
        tempScore = p.getTempScore();
        dieValue = p.getDieValue();
    }
    public int getPlayerID(){
        return playerID;
    }
    public int getPlayer0Score(){
        return player0Score;
    }
    public int getPlayer1Score(){
        return player1Score;
    }
    public int getTempScore(){
        return tempScore;
    }
    public int getDieValue(){
        return dieValue;
    }
    public void setPlayerID(int id){
        playerID = id;
    }
    public void setPlayer0Score(int pZeroScore){
        player0Score = pZeroScore;
    }
    public void setPlayer1Score(int pOneScore){
        player1Score = pOneScore;
    }
    public void setTempScore(int temp){
        tempScore = temp;
    }
    public void setDieValue(int dVal){
        dieValue = dVal;
    }
}
