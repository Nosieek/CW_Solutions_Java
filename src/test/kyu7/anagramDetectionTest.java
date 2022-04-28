package test.kyu7;

import main.kyu7.anagramDetection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramDetectionTest {

    @Test
    public void isAnagram() {
        anagramDetection k = new anagramDetection();

        assertEquals(true, k.isAnagram("foefet", "toffee"));
        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
        assertEquals(true, k.isAnagram("Twoo", "Woot"));
        assertEquals(false, k.isAnagram("apple", "pale"));
    }
}