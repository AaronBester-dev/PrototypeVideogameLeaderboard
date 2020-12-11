


/**
*Class that holds the main function.
*/
public class PrintLeaderboard {
/**
*Main that prints out the score and player id in the given file.
*@param args Command line arguments.
*/
  public static void main(String[] args) {
    ScoreCalc scoreCalculator = new ScoreCalc("sampleInput.txt");
    System.out.println(scoreCalculator.toString());
  }
}
