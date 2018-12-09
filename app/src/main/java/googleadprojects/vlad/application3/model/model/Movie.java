package googleadprojects.vlad.application3.model.model;

public class Movie {

    private String name;
    private String shortDescription;
    private String genre;
    private float rating;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie(String name, String shortDescription, String genre, float rating){
        this.name = name;
        this.shortDescription = shortDescription;
        this.genre = genre;
        this.rating = rating;
    }

}
