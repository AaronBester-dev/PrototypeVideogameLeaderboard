

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
*Class that creates all of the difficulties and prints it out when needed.
 */
public class ScoreCalc {

    private LinkedHashMap<String, Difficulty> scores = new LinkedHashMap<>();
/**
*Default constructor for the scorecalc class.
*/
    public ScoreCalc() {

    }
/**
*Constructor that creates a score calc and gets the data from the file given and makes a hashmap using the data.
*@param filename filename of the file to read from
*/
    public ScoreCalc(String filename) {
      LeaderboardParser parser = new LeaderboardParser(filename);
      ArrayList<String> listOfScores = parser.getListOfScores();
      String[] difficultyConstants = listOfScores.get(0).split(",");
      for (int i = 1; i < listOfScores.size(); i++) {
        Difficulty newDifficulty = makeDifficulty(listOfScores.get(i), difficultyConstants);
        scores.put(newDifficulty.getPlayerId(), newDifficulty);
      }
    }
/**
*gets the score of the difficulty attached to the playerid.
*@param playerId the id of the player you want the score of.
*@return the score associated with the playerid.
*/
    public double getScore(String playerId) {
       return scores.get(playerId).getLeaderBoardScore();
    }
/**
*Creates a string of every single difficulty and score.
*@return a string of every single difficulty and score.
*/
    public String toString() {
      String scoreString = "";
      boolean ranOnce = false;
      for (String playerId : scores.keySet()) {
        if (ranOnce) {
          scoreString += "\n";
        }
        scoreString += scores.get(playerId).toString();
        ranOnce = true;
      }
      return scoreString;
    }
/**
*Creates a difficulty of whatever type is located in the difficulty type in the string.
*@param score a string for a single score.
*@param difficultyConstants a string containing every difficulty constant.
*@return the difficulty created by the class.
*/
    public Difficulty makeDifficulty(String score, String[] difficultyConstants) {
      String[] listOfScoreComponents = score.split(",");
      if (listOfScoreComponents[1].equals("E")) {
        return ((Difficulty) new Easy(listOfScoreComponents, difficultyConstants));
      } else if (listOfScoreComponents[1].equals("H")) {
        return ((Difficulty) new Heroic(listOfScoreComponents, difficultyConstants));
      } else {
       return ((Difficulty) new HardCore(listOfScoreComponents, difficultyConstants));
      }
    }
}
