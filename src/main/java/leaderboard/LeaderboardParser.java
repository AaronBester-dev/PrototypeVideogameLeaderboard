package leaderboard;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

/**
*Class that parses the file for the information needed.
*/
public class LeaderboardParser {

    private ArrayList<String> listOfScores = new ArrayList<>();

/**
*Default constructor of the class.
*/
    public LeaderboardParser() {

    }
/**
*Default constructor that gets the strings from the file.
*@param filename name of the file to read from
*/
    public LeaderboardParser(String filename) {
      getStringsFromFile(filename);
    }
/**
*sets the list of scores for the class.
*@param newListOfScores the new list of scores.
 */
    void setListOfScores(ArrayList<String> newListOfScores) {
        listOfScores = newListOfScores;
    }
/**
*gets the list of scores for the class.
*@return the list of scores.
 */
    ArrayList<String> getListOfScores() {
        return listOfScores;
    }
/**
*gets the strings from the file given by the file name.
*@param filename filename of the file with the data.
*/
    void getStringsFromFile(String filename) {
      try {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String score;
        while ((score = reader.readLine()) != null) {
          listOfScores.add(score);
        }
        reader.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }


}
