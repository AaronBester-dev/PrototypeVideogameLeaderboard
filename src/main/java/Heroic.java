package leaderboard;


/**
*Subset of difficulty for heroic difficulties.
 */
public class Heroic extends Difficulty implements Challenged {
    private int numOfChallengesCompleted;
    private double bonusScore;
    private static final int DIFFICULTYCONSTANTLOCATION = 1;
    private static final int NUMCHALLENGESLOCATION = 2;
    private static final int BASESCORELOCATION = 3;
    private static final int COINSLOCATION = 4;
    private static final int TIMETAKENLOCATION = 5;
    private static final int LIVESLOCATION = 6;

    /**
    *Default constructor for heroic class.
    */
    public Heroic() {
        super();
    }
/**
*Default constructor for heroic that sets the values in the difficulty to the
*ones given by the two string arrays.
*@param listOfScoreComponents a string that holds the data for the specified difficulty.
*@param difficultyConstants a string that holds all of the difficulty constants.
*/
    public Heroic(String[] listOfScoreComponents, String[] difficultyConstants) {
      super();
      setPlayerId(listOfScoreComponents[0]);
      setDifficultyConstant(Double.parseDouble(difficultyConstants[DIFFICULTYCONSTANTLOCATION]));
      setNumChallengesComplete(Integer.decode(listOfScoreComponents[NUMCHALLENGESLOCATION]));
      setBaseScore(Double.parseDouble(listOfScoreComponents[BASESCORELOCATION]));
      setCoinsFound(Integer.decode(listOfScoreComponents[COINSLOCATION]));
      setTimeTaken(Double.parseDouble(listOfScoreComponents[TIMETAKENLOCATION]));
      setLivesLost(Integer.decode(listOfScoreComponents[LIVESLOCATION]));
      calculateLeaderBoardScore();
    }
/**
*Sets the number of challenges for the difficulty.
*@param numChallenges the new number of challenges to set the difficulty to.
*/
    @Override
    public void setNumChallengesComplete(int numChallenges) {
      numOfChallengesCompleted = numChallenges;
    }
/**
*Gets the number of challenges for the difficulty.
*@return the number of challenges the difficulty has.
*/
    @Override
    public int getNumChallengesComplete() {
      return numOfChallengesCompleted;
    }
/**
*Calculates and gets the bonus score.
*@return the calculated bonus score.
*/
    @Override
    public double getBonusScore() {
      return getNumChallengesComplete() * getDifficultyConstant();
    }
/**
*Calculates and set the leaderboardscore of the difficulty.
*/
    public void calculateLeaderBoardScore() {
      double firstBracket = getBaseScore() + getCoinsFound();
      double secondBracket = getTimeTaken() * getDifficultyConstant();
      double thirdBracket = getLivesLost() * getDifficultyConstant();
      double bonus = getNumChallengesComplete() * getDifficultyConstant();
      setLeaderBoardScore(firstBracket - secondBracket - thirdBracket + bonus);
    }
}
