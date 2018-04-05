package com.company;

/**
 *
 */
public class Movie
{
protected String movieTitle;
protected String movieRating;
protected String releaseDate;
protected Double runTime;
protected Integer numStars;


/**
 *
 * @param theName
 * @param date
 */
public Movie(String theName, String date)
{

	releaseDate = date;
	movieTitle = theName;
}


/**
 *
 */
public Movie()
{

	movieRating = "";
	releaseDate = "";
	runTime = 0.0;
	numStars = 0;
}


/**
 *
 * @param movieTitle
 */
public void setMovieTitle(String movieTitle)
{
	this.movieTitle = movieTitle;
}


/**
 *
 * @param movieRating
 */
public void setMovieRating(String movieRating)
{
	this.movieRating = movieRating;
}


/**
 *
 * @param movieReleaseDate
 */
public void setMovieReleaseDate(String movieReleaseDate)
{
	this.releaseDate = movieReleaseDate;
}


/**
 *
 * @param numStars
 */

public void setNumStars(Integer numStars)
{
	this.numStars = numStars;
}


/**
 *
 * @param numTime
 */

public void setRunTime(double numTime)
{
	this.runTime = numTime;
}


/**
 *
 * @return
 */

public double getTime()
{
	return runTime;
}


/**
 *
 * @return
 */

public String getRating()
{
	return movieRating;
}


public String getDate()
{
	return releaseDate;
}

/**
 *
 * @return
 */

public String getName()
{
	return movieTitle;
}

/**
 *
 * @return
 */

public Integer getStars()
{
	return numStars;
}
}