package dev.kellyburton.athenaeumcatalogueservice.models;

public class Rating {
    private String id;
    private int rating;

    public Rating() {
    }

    public Rating(String id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    public String getBookId() {
        return id;
    }

    public void setBookId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
