package leaderboard; 


public class Easy extends Difficulty implements Challenged{
  int numOfChallengesCompleted;
  double bonusScore;

  public Easy(){
    super();
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
    return bonusScore;
  }
}