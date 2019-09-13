package dev.alexferreira.projetobasico;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        Gson gson = new GsonBuilder().create();
        Book book = gson.fromJson("{isbn: \"123\"}", Book.class);
        Assert.assertEquals("123", book.getIsbn());
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        assertEquals(0, 2 - 2);
    }

    @Test
    public void mult_isCorrect() throws Exception {
        assertEquals(4, 2 * 2);
    }

    @Ignore("Refatoracao muito grande")
    @Test
    public void text_isCorrect() throws Exception {
        String testedVar = "este teste é exemplo de TDD";
        assertEquals("este teste é exemplo de TD", testedVar);
    }

    @Test
    public void null_isCorrect() throws Exception {
        String testedVar = "este teste é exemplo de TDD";
        assertNull("este teste é falho", null);
    }

    @Test
    public void notNull_isCorrect() throws Exception {
        String testedVar = null;
        assertNull("este teste é falho", testedVar);
    }

    @Test
    public void whenTestEqual_theyAreEquals() throws Exception {
        String testedVar = "Lorem Ipsum ismply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop pubshing software like Aldus Paeker including versions of Lorem Ipsum.";
        assertEquals("", "Lorem Ipsum ismply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop pubshing software like Aldus Paeker including versions of Lorem Ipsum.", testedVar);
    }
}