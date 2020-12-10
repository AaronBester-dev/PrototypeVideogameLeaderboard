package leaderboard;


public class Difficulty{
    String playerId;
    double baseScore;
    int coinsFound;
    double timeTaken;
    int livesLost;
    double difficultyConstant;
    double leaderBoardScore;

    public Difficulty(){
      baseScore = 0;
    }

    public void setPlayerId(String newPlayerID){
      playerId = newPlayerID;
    }

    public void setCoinsFound(int newCoinsFound){
      coinsFound = newCoinsFound;
    }

    public void setTimeTaken(double newTimeTaken){
      timeTaken = newTimeTaken;
    }

    public void setLivesLost(int newLivesLost){
      livesLost = newLivesLost;
    }

    public void setBaseScore(double newBaseScore){
      baseScore = newBaseScore;
    }

    public void getPlayerId(){
      return playerId;
    }

    public double getLeaderBoardScore(){
      return leaderBoardScore;
    }

    public String toString(){
      return playerId + "," + getLeaderBoardScore();
    }

    public void setDifficultyConstant(double val){
      difficultyConstant = val;
    }

    public double getDifficultyConstant(){
      return difficultyConstant;
    }
}