package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static Input sc = new Input();
    public static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        movieApp();
    }

    public static void menuPrompt() {
        System.out.println();
        System.out.println("---------------- Movie App ----------------");
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. View all movies");
        System.out.println("2. View all movies in the animated category");
        System.out.println("3. View all movies in the drama category");
        System.out.println("4. View all movies in the horror category");
        System.out.println("5. View all movies in the Sci-fi category");
        System.out.println("6. View all movies in the Musical category");
        System.out.println("7. Add a movie.");
        System.out.println();
    }

    public static void movieApp() {
        Movie[] moviesArr = MoviesArray.findAll();
        int entry = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            menuPrompt();
            entry = getUserEntry();
            System.out.println();
            switch (entry) {
                case 0:
                    keepGoing = false;
                    System.out.println("Program Exited.");
                    break;
                case 1:
                    getAllMovies(moviesArr);
                    break;
                case 2:
                    getMoviesFiltered(moviesArr, "animated");
                    break;
                case 3:
                    getMoviesFiltered(moviesArr, "drama");
                    break;
                case 4:
                    getMoviesFiltered(moviesArr, "horror");
                    break;
                case 5:
                    getMoviesFiltered(moviesArr, "scifi");
                    break;
                case 6:
                    getMoviesFiltered(moviesArr, "musical");
                    break;
                case 7:
                    moviesArr = updateArray(moviesArr, createMovie());
                    System.out.println(moviesArr[moviesArr.length - 1].toString());
                    break;
                default:
                    System.out.println("That is not one of the choices");
                    break;

            }
            System.out.println();
        }
        System.out.println("Program Exited.");
    }

    public static void getAllMovies(Movie[] moviesArr) {
        for (Movie movie : moviesArr) {
            System.out.println(movie);
        }
    }

    public static void getMoviesFiltered(Movie[] moviesArr, String query) {
        for (Movie movie : moviesArr) {
            if (movie.getCategory().equalsIgnoreCase(query)) {
                System.out.println(movie);
            }
        }
    }

    public static int getUserEntry() {
        int entry = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            try {
                entry = sc.getInt("Please make your selection");
                keepGoing = false;
            } catch (Exception e) {
                System.out.println("Dont do that.");
                System.out.println();
            }
        }
        return entry;
    }

    public static Movie createMovie() {
        String name = sc.getString("Enter the title of a movie.");
        System.out.println();
        String category = sc.getString("Enter the category");
        Movie movie = new Movie(name, category);
        return movie;
    }

    public static Movie[] updateArray(Movie[] moviesArr, Movie movie) {
        Movie[] updatedArray = new Movie[moviesArr.length + 1];
        for (int i = 0; i < moviesArr.length; i++) {
            updatedArray[i] = moviesArr[i];
        }
        updatedArray[updatedArray.length - 1] = movie;
        System.out.println("Movie added.");
        return updatedArray;
    }
}
