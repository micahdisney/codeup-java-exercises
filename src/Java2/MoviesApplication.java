package Java2;

/**
 * Created by micahdisney on 5/18/17.
 */
public class MoviesApplication {

    public static void main(String[] args) {

        MoviesArray listObject = new MoviesArray();
        Movie[] listOfMovies = listObject.findAll();
        Input userInput = new Input();

        while(true){
            System.out.println("" +
                    "Choose your selection by typing a number: \n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");


            switch (userInput.getInt(0, 5)){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for(Movie movie : listOfMovies){
                        System.out.println(movie.getName() + " ----- " + movie.getCategory() );
                    }
                    break;
                case 2:
                    for(Movie movie : listOfMovies){
                        if(movie.getCategory().equalsIgnoreCase("animated")){
                            System.out.println(movie.getName() + " ----- " + movie.getCategory() );
                        }
                    }
                    break;
                case 3:
                    for(Movie movie : listOfMovies){
                        if(movie.getCategory().equalsIgnoreCase("drama")){
                            System.out.println(movie.getName() + " ----- " + movie.getCategory() );
                        }
                    }
                    break;
                case 4:
                    for(Movie movie : listOfMovies){
                        if(movie.getCategory().equalsIgnoreCase("horror")){
                            System.out.println(movie.getName() + " ----- " + movie.getCategory() );
                        }
                    }
                    break;
                case 5:
                    for(Movie movie : listOfMovies){
                        if(movie.getCategory().equalsIgnoreCase("scifi")){
                            System.out.println(movie.getName() + " ----- " + movie.getCategory() );
                        }
                    }
                    break;
                default:
                    System.out.println("There are no movies with that category. please try again.");

            }
        }


    }

}

