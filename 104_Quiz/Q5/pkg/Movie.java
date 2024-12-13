package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRating;
    int revenue;
    public Movie(){
        movieName = new String("Avengers");
        rating = 8.0;
        numRating = 33;
        revenue = 623357910;
    }
    public Movie(String m, double r, int n, int rev){
        movieName = m;
        rating = r;
        numRating = n;
        revenue = rev;
    }
    public void movieToString(){
        System.out.println("movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRating);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double addRating(double a){
        rating = ((rating*(numRating*1.0)) + a) / (numRating + 1.0);
        return rating;
    }
    public boolean compareRatings(Movie mB){
        return mB.rating < this.rating;
    }
    
}
