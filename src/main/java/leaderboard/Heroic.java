package leaderboard;

public class Heroic extends Difficulty implements Challenged{
    private int numOfChallengesCompleted;
    private double bonusScore;
     
    public Heroic(){
        super();
    }
    
    public Heroic(String[] listOfScoreComponents, String[] difficultyConstants){
      super();
      setPlayerId(listOfScoreComponents[0]);
      setDifficultyConstant(Double.parseDouble(difficultyConstants[1]));
      setNumChallengesComplete(Integer.decode(listOfScoreComponents[2]));
      setBaseScore(Double.parseDouble(listOfScoreComponents[3]) + getNumChallengesComplete());
      setCoinsFound(Integer.decode(listOfScoreComponents[4]));
      setTimeTaken(Double.parseDouble(listOfScoreComponents[5]));
      setLivesLost(Integer.decode(listOfScoreComponents[6]));
      calculateLeaderBoardScore();
    }

    @Override
    public void setNumChallengesComplete(int numChallenges){
      numOfChallengesCompleted = numChallenges;
    }
  
    @Override
    public int getNumChallengesComplete(){
      return numOfChallengesCompleted;
    }
  
    @Override
    public double getBonusScore(){
      return getNumChallengesComplete() * getDifficultyConstant();
    }

    public void calculateLeaderBoardScore(){
      double firstBracket = getBaseScore() + getCoinsFound();
      double secondBracket = getTimeTaken() * getDifficultyConstant();
      double thirdBracket = getLivesLost() * getDifficultyConstant();
      setLeaderBoardScore(firstBracket - secondBracket - thirdBracket);
    }
}