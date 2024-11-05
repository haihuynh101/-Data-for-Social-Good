public class movieData {

 
private String title;             //The title of the movie
  private String genre;          // the movies genre
  private double avgRating;           // the rating of the movie
  private int numVotes;             // the number of votes that were for a movie
  private int ReleaseYear;           // the year the movie was released

  /*
  * 
  */
  public movieData() {
    title = title;
    genre = genre;
    avgRating = avgRating;
    numVotes = numVotes;
    ReleaseYear = ReleaseYear;
  }
  
  public movieData(String title, String genre, double avgRating, int votes, int ReleaseYear){
    this.title = title;
    this.avgRating = avgRating;
    this.numVotes = votes;
    this.genre = genre;
    this.ReleaseYear = ReleaseYear;
  }

  public String getTitle() {
    return title;
  }

public double getAvgRating() {
    return avgRating;
  }

public int getNumVotes() {
    return numVotes;
  }

public String getGenre() {
    return genre;
  }


public int getReleaseYear() {
    return ReleaseYear;
  }


 public String toString() {
  // to string that organizes the information
   
    return title + " - " + genre + " - " + avgRating + " - " + numVotes + " - " + ReleaseYear;
  }




 
}