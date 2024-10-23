package chapter3;

public class Ratings {
	
	enum MovieRating {G, PG, PG13, R, NC17};
	
	public static void main(String[] args) {
		String movie = "Joker 2";
		MovieRating rating = MovieRating.R;
		
		
		System.out.println(movie + " is rated " + rating);
		System.out.println("The ordinal of rating is " + rating.ordinal());
	}
}
