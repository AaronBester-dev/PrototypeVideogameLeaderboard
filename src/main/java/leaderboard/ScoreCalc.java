package leaderboard;

public class ScoreCalc{

    private HashMap<String, Difficulty> scores = new HashMap<>();

    public ScoreCalc(){

    }

    public ScoreCalc(string filename){
      leaderboardParser parser = new leaderboardParser(filename);
      ArrayList<String> listOfScores = parser.getListOfScores();
      convertStringsToDifficulties(ArrayList<String> listOfScores);
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

    public void makeDifficulty(String score){
      String[] = score.split(",");

        

    }

}