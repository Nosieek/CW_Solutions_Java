package test.kyu6;

import main.kyu6.arrayDiff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class arrayDiffTest {

    @Test
    void arrayDiff() {
        assertArrayEquals(new int[] {2}, arrayDiff.arrayDifferent(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, arrayDiff.arrayDifferent(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, arrayDiff.arrayDifferent(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, arrayDiff.arrayDifferent(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, arrayDiff.arrayDifferent(new int [] {}, new int[] {1,2}));
    }
}