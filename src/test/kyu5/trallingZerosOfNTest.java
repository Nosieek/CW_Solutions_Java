package test.kyu5;

import org.junit.jupiter.api.Test;
import main.kyu5.trallingZerosOfN;

import static org.junit.jupiter.api.Assertions.*;

class trallingZerosOfNTest {

    @Test
    public void testZeros() throws Exception {
        assertEquals( 0, trallingZerosOfN.zeros(0));
        assertEquals( 1, trallingZerosOfN.zeros(6));
        assertEquals( 2, trallingZerosOfN.zeros(14));
        assertEquals(2, trallingZerosOfN.zeros(14));
        assertEquals(24, trallingZerosOfN.zeros(100));
        assertEquals(31, trallingZerosOfN.zeros(125));
        assertEquals(249, trallingZerosOfN.zeros(1000));



    }
}