package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testToString() {
        Review review = new Review("I love this restaurant!", "Shan", 5);
        assertNotNull("Review should not be null", review.toString());
        System.out.println(review.toString());
    }
}