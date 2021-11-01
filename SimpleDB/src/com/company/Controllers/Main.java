package com.company.Controllers;

import com.company.models.Movie;
import com.company.views.CmdLineView;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;

public class Main {
    public static  CmdLineView newMovieInfo;
    public static String movieName;
    public static String releaseYear;
    public static String rating;

    public static void main(String[] args) {

       DBConnect db = new DBConnect("movies.db");
        db.createNewDatabase();
        db.addTables();
        db.addData("Star Wars", "1977", "PG");
        db.addData("CODA", "2021", "PG-13");
        db.addData("The Life of Emile Zola", "1937", "NR");
        db.addData("The Night House", "2021", "R");

        // Get new movie Info

        newMovieInfo = new CmdLineView(movieName, releaseYear, rating);
        System.out.print("Enter New Movie info: ");
        newMovieInfo.getMovieInfo();
        movieName = newMovieInfo.getMovieName();
        releaseYear = newMovieInfo.getMovieReleaseYear();
        rating = newMovieInfo.getMovieRating();

        if (movieName == null || releaseYear == null || rating == null ||
                movieName.length() == 0 || releaseYear.length() == 0 || rating.length() == 0)
            System.out.println("Entered Movie Info is not valid. Please Enter again..");
        else
            db.addData(movieName, releaseYear, rating);

        ArrayList<Movie> theMovies = db.getData();
        for(Movie movie : theMovies){
            System.out.println(movie.toString());
        }


    }
}
