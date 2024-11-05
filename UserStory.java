import java.util.Scanner;

public class UserStory {

  private movieData[] userData;

  /*
  * inserts every txt data column into userdata
  */
  public UserStory(String titleFile, String genreFile, String avgRatingFile, String numVotesFile, String releaseYearFile) {
    userData = createUserData(titleFile, genreFile, avgRatingFile, numVotesFile, releaseYearFile);
  }

  /*
  * Sets file reader for riles and uses for loop to go through each 1D array
  */
  public movieData[] createUserData(String titleFile, String genreFile, String avgRatingFile, String numVotesFile, String releaseYearFile) {
    String[] title = FileReader.toStringArray(titleFile);
    String[] genre = FileReader.toStringArray(genreFile);
    double[] avgRating = FileReader.toDoubleArray(avgRatingFile);
    int[] numVotes = FileReader.toIntArray(numVotesFile);
    int[] releaseYear = FileReader.toIntArray(releaseYearFile);
    movieData[] tempUserData = new movieData[title.length];

    for (int i = 0; i < tempUserData.length; i++) {
      tempUserData[i] = new movieData(title[i], genre[i], avgRating[i], numVotes[i], releaseYear[i]);
    }
    return tempUserData;
  }

  // sets up to string and makes new line after each movie's info is printed out
  public String toString() {
    String result = "";

    for (movieData data : userData) {
      result += data + "\n";
    }
    
    return result;
  }

  
}