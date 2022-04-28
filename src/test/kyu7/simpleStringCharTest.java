package test.kyu7;

import main.kyu7.simpleStringChar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class simpleStringCharTest {
    simpleStringChar ourTest = new simpleStringChar();
    @Test
    public void solve() {
        assertArrayEquals(new int[]{1,18,3,2}, simpleStringChar.Solve("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, simpleStringChar.Solve("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, simpleStringChar.Solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, simpleStringChar.Solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, simpleStringChar.Solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, simpleStringChar.Solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
}