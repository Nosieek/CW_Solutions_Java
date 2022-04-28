package test.kyu6;
import main.kyu6.microwaveMaidEp1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class microwaveMaidEp1Test {
    public microwaveMaidEp1 t = new microwaveMaidEp1();

    @Test
    public void BasicKata() {
        assertEquals("6", t.getBestCombination(6));
        assertEquals("33", t.getBestCombination(33));
        assertEquals("60", t.getBestCombination(60));
        assertEquals("111", t.getBestCombination(71));
        assertEquals("72", t.getBestCombination(72));
        assertEquals("90", t.getBestCombination(90));
        assertEquals("99", t.getBestCombination(99));
        assertEquals("155", t.getBestCombination(115));
        assertEquals("201", t.getBestCombination(121));
        assertEquals("300", t.getBestCombination(180));
        assertEquals("433", t.getBestCombination(273));
        assertEquals("399", t.getBestCombination(279));
        assertEquals("6130", t.getBestCombination(3690));
        assertEquals("7777", t.getBestCombination(4697));
        assertEquals("8735", t.getBestCombination(5255));
    }

}