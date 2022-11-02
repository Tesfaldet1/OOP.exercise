package oppExercise;

import org.junit.Before;

import org.junit.Test;
import org.junit.Assert;

public class BooksTest {
    @Before
    public void starTestBooks(){
        Books title = new Books("Java how to program","Paul Dei-tel",true);

    }
    @Test
    public  void testTitle(){
        String expectedBookTile = "Java how to program";
        String actualBookTitle = Books.getTitle();
        Assert.assertEquals(expectedBookTile,actualBookTitle);

    }
    @Test
    public void testAuthor(){
       String expectAuthorName="Paul Dei-tel";
       String actualAuthorName = Books.getAuthor();
       Assert.assertEquals(expectAuthorName,actualAuthorName);

    }
    @Test
    public void testAvailability(){
        boolean expectedAvailability = true;
        boolean actualAvailability=Books.isAvailable();
        Assert.assertEquals(expectedAvailability,actualAvailability);
    }


}