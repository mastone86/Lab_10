package com.company;
import java.lang.*;


public class Main
{

public static void main(String[] args)
{

	//call to non-default constuctor and methods
	Movie movieName = new Movie ("Fargo", "Sometime in the 90's");

	//call to default constructors and methods
	//aka parameter-less
	Movie movieDetails = new Movie ();

	movieDetails.setMovieReleaseDate("some time in the 90's");
	movieDetails.setNumStars(5);
	movieDetails.setMovieRating("R");
	movieDetails.setRunTime(120.45);

	//printing everything
	System.out.println("Movie 1 is " + movieName.getName());
	System.out.println(movieName.getName() + "'s rating is " + movieDetails.getRating());
	System.out.println("The release date was " + movieDetails.getDate());
	System.out.println("The movie's runtime was " + movieDetails.getTime() + " minutes");
	System.out.println(movieName.getName() + " got " + movieDetails.getStars() + " stars.");




}//end main method


}//end Main class