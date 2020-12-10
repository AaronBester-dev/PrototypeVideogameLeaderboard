package leaderboard;


public class HardCore extends Difficulty{

    public HardCore(){
      super();
    }

    public HardCore(String[] listOfScoreComponents, String[] difficultyConstants){
      super();
      setPlayerId(listOfScoreComponents[0]);
      setDifficultyConstant(Double.parseDouble(difficultyConstants[2]));
      setBaseScore(listOfScoreComponents[3]);
      setCoinsFound(listOfScoreComponents[4]);
      setTimeTaken(listOfScoreComponents[5]);
      setLivesLost(listOfScoreComponents[6]);
    }

    public void setLeaderBoardScore(){
      double firstBracket = getBaseScore() + getCoinsFound();
      double secondBracket = getTimeTaken() * getDifficultyConstant();
      leaderBoardScore = firstBracket - secondBracket;
    }
}