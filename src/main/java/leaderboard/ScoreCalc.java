package leaderboard;

import java.util.ArrayList;
import java.util.HashMap;


public class ScoreCalc{

    private HashMap<String, Difficulty> scores = new HashMap<>();

    public ScoreCalc(){

    }

    public ScoreCalc(String filename){
      leaderboardParser parser = new leaderboardParser(filename);
      ArrayList<String> listOfScores = parser.getListOfScores();
      String[] difficultyConstants = listOfScores.get(0).split(",");
      for(int i = 1; i < listOfScores.size(); i++){
        Difficulty newDifficulty = makeDifficulty(listOfScores.get(i), difficultyConstants);
        scores.put(newDifficulty.getPlayerId(), newDifficulty);
      }
    }

    public double getScore(String playerId){
       return scores.get(playerId).getLeaderBoardScore();
    }

    public String toString(){
      String scoreString = "";
      for(String playerId : scores.keySet()){
        scoreString += scores.get(playerId).toString();
      }
      return scoreString;
    }

    public Difficulty makeDifficulty(String score, String[] difficultyConstants){
      String[] listOfScoreComponents = score.split(",");
      if (listOfScoreComponents[1].equals("E")){
        return ( (Difficulty) new Easy(listOfScoreComponents, difficultyConstants));
      }
      else if (listOfScoreComponents[1].equals("H")){
        return ( (Difficulty) new Heroic(listOfScoreComponents, difficultyConstants));
      }
      else{
       return ( (Difficulty) new HardCore(listOfScoreComponents, difficultyConstants));
      }
    }

}