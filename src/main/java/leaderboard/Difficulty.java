package leaderboard;


public class Difficulty{
    String playerId;
    double baseScore;
    int coinsFound;
    double timeTaken;
    int livesLost;
    double difficultyConstant;
    char difficultyLevel;
    double leaderBoardScore;


    public Difficulty(){

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
}