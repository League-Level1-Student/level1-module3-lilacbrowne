/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */



import java.util.ArrayList;
import java.util.Collections;

public class NetflixQueue {
	public static void main(String[] args) {
		NetflixQueue Netflix = new NetflixQueue(); 
		Movie Incredibles = new Movie("The Incredibles", 7); 
		Movie ToyStory = new Movie ("Toy Story", 7);
		Movie FindingNemo = new Movie ("Finding Nemo", 10);
		Movie Cars = new Movie ("Cars", 9);
		Movie WreckItRalph = new Movie ("Wreck-It-Ralph", 8); 
		System.out.println(WreckItRalph.getTicketPrice());
		Netflix.addMovie(WreckItRalph);
		Netflix.addMovie(Cars);
		Netflix.addMovie(ToyStory);
		Netflix.addMovie(FindingNemo);
		Netflix.addMovie(Incredibles);
		Netflix.printMovies();
		System.out.println("The best movie is " + Netflix.getBestMovie());
		
	}
	
	
	ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public Movie getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public Movie getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		Collections.sort(movies);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}

}
