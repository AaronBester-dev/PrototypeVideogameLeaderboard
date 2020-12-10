package leaderboard;

public class Heroic extends Difficulty implements Challenged{
    int numOfChallengesCompleted;
    double bonusScore;
     
    public Heroic(){
        super();
    }
    
    public Heroic(String[] listOfScoreComponents, String[] difficultyConstants){
      super();
      setPlayerId(listOfScoreComponents[0]);
      setDifficultyConstant(Double.parseDouble(difficultyConstants[1]));
      setNumChallengesComplete(listOfScoreComponents[2]);
      setBaseScore(listOfScoreComponents[3] + getNumChallengesComplete());
      setCoinsFound(listOfScoreComponents[4]);
      setTimeTaken(listOfScoreComponents[5]);
      setLivesLost(listOfScoreComponents[6]);
    }

    @Override
    public void setNumChallengesComplete(int numChallenges){

    }
  
    @Override
    public int getNumChallengesComplete(){

    }
  
    @Override
    public double getBonusScore(){
      return getNumChallengesComplete() * getDifficultyConstant();
    }

    public void setLeaderBoardScore(){
      double firstBracket = getBaseScore() + getCoinsFound();
      double secondBracket = getTimeTaken() * getDifficultyConstant();
      double thirdBracket = getLivesLost() * getDifficultyConstant();
      leaderBoardScore = firstBracket - secondBracket - thirdBracket;
    }
}