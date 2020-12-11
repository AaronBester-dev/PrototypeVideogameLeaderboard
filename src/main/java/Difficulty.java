package leaderboard;
import java.text.DecimalFormat;
/**
*Main difficulty class.
*/
public class Difficulty {
    private String playerId;
    private double baseScore;
    private int coinsFound;
    private double timeTaken;
    private int livesLost;
    private double difficultyConstant;
    private double leaderBoardScore;
/**
*Default difficulty class.
 */
    public Difficulty() {
      baseScore = 0;
      coinsFound = 0;
      timeTaken = 0;
      livesLost = 0;
      difficultyConstant = 0;
      leaderBoardScore = 0;
    }
/**
*Sets the playerId of the difficulty to the given id.
*@param newPlayerID id of the new player
 */
    public void setPlayerId(String newPlayerID) {
      playerId = newPlayerID;
    }
/**
*Sets the number of coins of the difficulty to the given number.
*@param newCoinsFound new number of coins.
 */
    public void setCoinsFound(int newCoinsFound) {
      coinsFound = newCoinsFound;
    }
/**
*gets the number of coins of the difficulty.
*@return number of coins in the difficulty
 */
    public int getCoinsFound() {
      return coinsFound;
    }
/**
*sets the time taken of the difficulty.
*@param newTimeTaken new time taken
 */
    public void setTimeTaken(double newTimeTaken) {
      timeTaken = newTimeTaken;
    }
/**
*gets the time taken of the difficulty.
*@return amount of time taken
 */
    public double getTimeTaken() {
      return timeTaken;
    }
/**
*sets the number of lives lose of the difficulty.
*@param newLivesLost new number of lives lost.
 */
    public void setLivesLost(int newLivesLost) {
      livesLost = newLivesLost;
    }
/**
*gets the number of lives lost of the difficulty.
*@return number of lives lost.
 */
    public int getLivesLost() {
      return livesLost;
    }
/**
*sets the base score of the difficulty.
*@param newBaseScore new base score.
 */
    public void setBaseScore(double newBaseScore) {
      baseScore = newBaseScore;
    }
/**
*gets the base score of the difficulty.
*@return base score.
 */
    public double getBaseScore() {
      return baseScore;
    }
/**
*gets the playerId of the difficulty.
*@return player Id.
 */
    public String getPlayerId() {
      return playerId;
    }
/**
*sets the leaderboard score of the difficulty.
*@param newLeaderBoardScore new leaderboardscore
 */
    public void setLeaderBoardScore(double newLeaderBoardScore) {
      leaderBoardScore = newLeaderBoardScore;
    }
/**
*gets the leaderboardscore of the difficulty.
*@return leaderboardscore of the difficulty
 */
    public double getLeaderBoardScore() {
      return leaderBoardScore;
    }
/**
*Takes the playerid and leaderboardscore of the difficulty.
*@return the playerid and leaderboard score in string form.
*/
    public String toString() {
      DecimalFormat doubleFormat = new DecimalFormat("0.###############");
      return playerId + "," + doubleFormat.format(getLeaderBoardScore());
    }
/**
*sets the difficulty constant of the difficulty.
*@param val new difficulty constant.
 */
    public void setDifficultyConstant(double val) {
      difficultyConstant = val;
    }
/**
*gets the difficulty constant of the difficulty.
*@return difficulty constant of the difficulty
 */
    public double getDifficultyConstant() {
      return difficultyConstant;
    }
}
