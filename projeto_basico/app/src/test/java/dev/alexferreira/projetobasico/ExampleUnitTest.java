package dev.alexferreira.projetobasico;

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
        assertEquals(4, 2 + 2);
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        assertEquals(4, 2 - 2);
    }

    @Test
    public void mult_isCorrect() throws Exception {
        assertEquals(4, 2 * 2);
    }

    @Test
    public void text_isCorrect() throws Exception {
        String testedVar = "este teste é exemplo de TDD";
        assertEquals("este teste é falho", testedVar);
    }

    @Test
    public void null_isCorrect() throws Exception {
        String testedVar = "este teste é exemplo de TDD";
        assertNull("este teste é falho", null);
    }

    @Test
    public void notNull_isCorrect() throws Exception {
        String testedVar = null;
        assertNotNull("este teste é falho", testedVar);
    }

    @Test
    public void whenTestEqual_theyAreEquals() throws Exception {
        String testedVar = "este teste é um teste bem escrito ";
        assertEquals("A variavel de texto não é igual a outra, encontre o erro e corrija dev", "este teste é um teste bem escrito", testedVar);
    }
}