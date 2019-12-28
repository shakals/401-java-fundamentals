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

    public String toString() {
        String output = "User " + this.author + " rated the restaurant with " + this.stars + " stars and provided the following review: \n " + this.body;
        return output;
    }
}
