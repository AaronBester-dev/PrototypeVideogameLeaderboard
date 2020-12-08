package leaderboard;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

public class leaderboardParser(){

    private ArrayList<String> listOfScores = new ArrayList<>(); 

    public leaderboardParser(){

    }

    public leaderboardParser(String filename){
      getStringsFromFile(filename);
    }

    void setListOfScores(ArrayList<String> newListOfScores){
        listOfScores = newListOfScores;
    }

    ArrayList<String> getListOfScores(){
        return listOfScores;
    }

    void getStringsFromFile(String filename){
    // Similar to above but with BufferedReader
    
      try {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String score;
 
        while ( (score = bufReader.readLine()) != null) {
          listOfScores.add(score);
        }
        bufReader.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }


}