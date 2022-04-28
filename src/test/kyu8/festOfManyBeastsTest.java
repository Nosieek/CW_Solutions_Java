package test.kyu8;
import org.junit.jupiter.api.Test;
import main.kyu8.festOfManyBeasts;
import static org.junit.jupiter.api.Assertions.*;

class festOfManyBeastsTest {

    @Test
    public void fixedTest() {
        assertTrue(festOfManyBeasts.feast("great blue heron","garlic nann"));
        assertTrue(festOfManyBeasts.feast("chickadee","chocolate cake"));
        assertFalse(festOfManyBeasts.feast("brown bear","bear claw"));
    }
}