package leaderboard;

public class ScoreCalc{

    private HashMap<String, Difficulty> scores = new HashMap<>();

    public ScoreCalc(){

    }

    public ScoreCalc(string filename){
      leaderboardParser parser = new leaderboardParser(filename);
      ArrayList<String> listOfScores = parser.getListOfScores();
      String[] difficultyConstants = listOfScores.get(0).split(",");
      for(int i = 1; i < listOfScores.size(), i++){
        Difficulty newDifficulty = makeDifficulty(listOfScores.get(i), difficultyConstants);
        scores.put(newDifficulty.getPlayerId(), newDifficulty);
      }
    }

    public double getScore(String playerId){
       return scores.get(playerId);
    }

    public String toString(){
      String scoreString = "";
      for(String playerId : scores.keySet()){
        scoreString += scores.get(playerId).toString();
      }
      return scoreString;
    }

    public void makeDifficulty(String score, String[] difficultyConstants){
      String[] listOfScoreComponents = score.split(",");
      if(listOfScoreComponents[1].equals("E")){
        return Difficulty easyDifficulty = new Easy(String[] listOfScores, String[] difficultyConstants);
      }
      else if(listOfScoreComponents[1].equals("H")){
        return Difficulty heroicDifficulty = new Heroic(String[] listOfScores, String[] difficultyConstants);
      }
      else{
       return Difficulty hardCoreDifficulty = new HardCore(String[] listOfScores, String[] difficultyConstants);
      }
    }

}