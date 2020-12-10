package leaderboard;


public class Difficulty{
    private String playerId;
    private double baseScore;
    private int coinsFound;
    private double timeTaken;
    private int livesLost;
    private double difficultyConstant;
    private double leaderBoardScore;

    public Difficulty(){
      baseScore = 0;
    }

    public void setPlayerId(String newPlayerID){
      playerId = newPlayerID;
    }

    public void setCoinsFound(int newCoinsFound){
      coinsFound = newCoinsFound;
    }

    public int getCoinsFound(){
      return coinsFound;
    }

    public void setTimeTaken(double newTimeTaken){
      timeTaken = newTimeTaken;
    }

    public double getTimeTaken(){
      return timeTaken;
    }

    public void setLivesLost(int newLivesLost){
      livesLost = newLivesLost;
    }

    public int getLivesLost(){
      return livesLost;
    }

    public void setBaseScore(double newBaseScore){
      baseScore = newBaseScore;
    }

    public double getBaseScore(){
      return baseScore;
    }

    public String getPlayerId(){
      return playerId;
    }
    
    public void setLeaderBoardScore(double newLeaderBoardScore){
      leaderBoardScore = newLeaderBoardScore;
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