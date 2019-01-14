import model.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertSame;
import static org.mockito.Mockito.*;

/**
 *  Testing class for Movie functionality
 */

public class MovieTest {

    private String director;
    private ArrayList<String> writers = new ArrayList<String>();
    private ArrayList<String> stars = new ArrayList<String>();
    private Movie movie;

    /**
     * Setting up mock object with initiation data
     */
    @Before
    public void setup() {
        // arrange
        writers.add("William Goldman");
        stars.add("Ron Livingston");
        stars.add("Jennifer Aniston");
        stars.add("David Herman");
        director = "Mike Judge";
        movie = mock(Movie.class);
    }

    /**
     * 3 input tests with mock object
     * Test if the methods setDirector, setWriters and setStars were called before with the same values as parameters
     * Test for the setDirector, setWriters and setStars methods with checks for the indirect inputs using a mock object
     */
    @Test
    public void verifyMovieParametersInput(){
        // act
        movie.setDirector(director);
        movie.setWriters(writers);
        movie.setStars(stars);
        //verify
        verify(movie).setDirector(director);
        verify(movie).setWriters(writers);
        verify(movie).setStars(stars);
    }

    /**
     * 3 output tests with mock object
     * Test for the getDirector method with checks for the indirect outputs using a mock object
     */
    @Test
    public void verifyReturnOfMovie(){
        // act
        when(movie.getDirector()).thenReturn(director);
        when(movie.getWriters()).thenReturn(writers);
        when(movie.getStars()).thenReturn(stars);
        // verify
        assertSame(movie.getDirector(), director);
        assertSame(movie.getWriters(), writers);
        assertSame(movie.getStars(), stars);
    }
}
