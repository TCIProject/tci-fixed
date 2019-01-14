import interfaceModel.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertSame;
import static org.mockito.Mockito.*;

/**
 * Testing class for book functionality
 */
public class BookTest {

    private ArrayList<String> array;
    private String isbn;
    private String publisher;
    private Book book;

    /**
     * Setting up mock object with initiation data
     */
    @Before
    public void setup() {
        // arrange
        array = new ArrayList<>();
        array.add("Hans");
        array.add("Mans");
        isbn = "159";
        publisher = "Pesho";
        book = mock(Book.class);
    }
    
    /**
     * 3 input test with mock objects
     */
    @Test
    public void verifyParametersInput() {
        // act
        book.setISBN(isbn);
        book.setAuthors(array);
        book.setPublisher(publisher);
        // verify
        verify(book).setISBN(isbn);
        verify(book).setAuthors(array);
        verify(book).setPublisher(publisher);
    }

    /**
     * 3 outputs test with mock object
     */
    @Test
    public void verifyReturnOfBook() {
        // act
        when(book.getAuthors()).thenReturn(array);
        when(book.getISBN()).thenReturn(isbn);
        when(book.getPublisher()).thenReturn(publisher);
        // verify
        assertSame(book.getAuthors(), array);
        assertSame(book.getISBN(), isbn);
        assertSame(book.getAuthors(), array);
    }
}
