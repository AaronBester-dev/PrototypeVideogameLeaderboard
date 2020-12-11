package leaderboard;

/**
*Subset of difficulty for hardcore difficulties.
 */
public class HardCore extends Difficulty {
  private double timeBeforeDeath;
  private static final int DIFFICULTYCONSTANTLOCATION = 2;
  private static final int BASESCORELOCATION = 3;
  private static final int COINSLOCATION = 4;
  private static final int TIMETAKENLOCATION = 5;
  private static final int LIVESLOCATION = 6;
/**
    *Default constructor for hardcore class.
    */
    public HardCore() {
      super();
    }
/**
*Constructor for hardcore that sets the values in the difficulty to the
*ones given by the two string arrays.
*@param listOfScoreComponents a string that holds the data for the specified difficulty.
*@param difficultyConstants a string that holds all of the difficulty constants.
*/
    public HardCore(String[] listOfScoreComponents, String[] difficultyConstants) {
      super();
      setPlayerId(listOfScoreComponents[0]);
      setDifficultyConstant(Double.parseDouble(difficultyConstants[DIFFICULTYCONSTANTLOCATION]));
      setBaseScore(Double.parseDouble(listOfScoreComponents[BASESCORELOCATION]));
      setCoinsFound(Integer.decode(listOfScoreComponents[COINSLOCATION]));
      setTimeTaken(Double.parseDouble(listOfScoreComponents[TIMETAKENLOCATION]));
      setLivesLost(Integer.decode(listOfScoreComponents[LIVESLOCATION]));
      calculateLeaderBoardScore();
    }
/**
*Sets the time before death of the hardcore class.
*@param gameMinutes the new time before death.
*/
    public void setTimeBeforeDeath(double gameMinutes) {
      timeBeforeDeath = gameMinutes;
    }
/**
*Calculates and set the leaderboardscore of the difficulty.
*/
    public void calculateLeaderBoardScore() {
      double firstBracket = getBaseScore() + getCoinsFound();
      double secondBracket = getTimeTaken() * getDifficultyConstant();
      setLeaderBoardScore(firstBracket - secondBracket);
    }
}
