package leaderboard;

/**
*Interface that is used to implement the number of challenges for the easy and heroic difficulties.
*/
public interface Challenged {
/**
*Sets the number of challenges completed.
*@param numChallenges the new numner of challenges completed.
*/
    void setNumChallengesComplete(int numChallenges);
/**
*gets the number of challenges completed.
*@return the number of challenges completed.
*/
    int getNumChallengesComplete();
/**
*gets the bonus score.
*@return the bonus score.
*/
    double getBonusScore();
}
