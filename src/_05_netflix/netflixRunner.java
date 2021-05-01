package _05_netflix;

public class netflixRunner {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Avatar", 4);
		Movie movie2 = new Movie("Fast and Furious", 2);
		Movie movie3 = new Movie("The Matrix", 5);
		Movie movie4 = new Movie("Napolean Dynamite", 4);
		Movie movie5 = new Movie("Forrest Gump", 3);
		System.out.println(movie1.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie());
		queue.sortMoviesByRating();
		System.out.println("The second best movie is " + queue.getMovie(2));
	}
}
