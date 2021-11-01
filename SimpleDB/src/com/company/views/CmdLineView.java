package com.company.views;

import java.util.Scanner;

public class CmdLineView {
    private String movieName;
    private String releaseYear;
    private String rating;

    public CmdLineView(String movieName, String releaseYear, String rating) {

        this.movieName = movieName;
        this.releaseYear =releaseYear;
        this.rating = rating;
    }

    public void getMovieInfo() {
        System.out.print("Enter New Movie info: ");
        Scanner usrInput = new Scanner(System.in);
        this.movieName = usrInput.nextLine();
        System.out.print("Enter New Movie release year: ");
        this.releaseYear = usrInput.nextLine();
        System.out.print("Enter New Movie Rating: ");
        this.rating = usrInput.nextLine();

        System.out.print(movieName + "    " + releaseYear + "    " + rating);
        System.out.print("\n");
    }
    public String getMovieName() {
        return this.movieName;
    }
    public String getMovieReleaseYear() {
        return this.releaseYear;
    }
    public String getMovieRating() {
        return this.rating;
    }

}
