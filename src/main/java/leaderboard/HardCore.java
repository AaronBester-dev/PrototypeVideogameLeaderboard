package leaderboard;


public class HardCore extends Difficulty{

    public HardCore(){
      super();
    }

    public HardCore(String[] listOfScoreComponents, String[] difficultyConstants){
      super();
      setPlayerId(listOfScoreComponents[0]);
      setDifficultyConstant(Double.parseDouble(difficultyConstants[2]));
      setBaseScore(Double.parseDouble(listOfScoreComponents[3]));
      setCoinsFound(Integer.decode(listOfScoreComponents[4]));
      setTimeTaken(Double.parseDouble(listOfScoreComponents[5]));
      setLivesLost(Integer.decode(listOfScoreComponents[6]));
      calculateLeaderBoardScore();
    }

    public void calculateLeaderBoardScore(){
      double firstBracket = getBaseScore() + getCoinsFound();
      double secondBracket = getTimeTaken() * getDifficultyConstant();
      setLeaderBoardScore(firstBracket - secondBracket);
    }
}