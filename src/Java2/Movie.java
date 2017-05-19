package Java2;

/**
 * Created by micahdisney on 5/18/17.
 */

public class Movie {

    private String name;
    private String category;


    public Movie (String name, String categorie){
        this.name = name;
        this.category = categorie;
    }

    public String getName() {
        return this.name;
    }


    public String getCategory() {
        return this.category;
    }


}
