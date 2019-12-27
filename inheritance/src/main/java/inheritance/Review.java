package inheritance;

public class Review {
    protected String body;
    protected String author;
    protected int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }
}
