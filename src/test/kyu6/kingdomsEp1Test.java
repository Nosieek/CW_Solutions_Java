package test.kyu6;

import org.junit.jupiter.api.Test;
import main.kyu6.kingdomsEp1;

import static org.junit.jupiter.api.Assertions.*;

class kingdomsEp1Test {
    kingdomsEp1 test = new kingdomsEp1();
    @Test
    void joust() {
        assertArrayEquals(new String[] {
                " $->   ",
                "   <-P "
        }, test.joust(new String[] {
                "$->    ",
                "    <-P"
        }, 1, 1));
        assertArrayEquals(new String[] {
                "  $->   ",
                "   <-P  "
        }, test.joust(new String[] {
                "$->     ",
                "     <-P"
        }, 1, 1));
        assertArrayEquals(new String[] {
                "      $->        ",
                "        <-P      "
        }, test.joust(new String[] {
                "$->              ",
                "              <-P"
        }, 1, 1));
    }

    @Test
    void differentVelocity() {
        assertArrayEquals(new String[] {
                "   $-> ",
                " <-P   "
        }, test.joust(new String[] {
                "$->    ",
                "    <-P"
        }, 3, 3));
        assertArrayEquals(new String[] {
                "$->     ",
                " <-P    "
        }, test.joust(new String[] {
                "$->     ",
                "     <-P"
        }, 0, 2));
        assertArrayEquals(new String[] {
                "      $->        ",
                "     <-P         "
        }, test.joust(new String[] {
                "$->              ",
                "              <-P"
        }, 2,3));
    }

    @Test
    void immediateBattle() {
        assertArrayEquals(new String[] {
                "$->  ",
                "  <-P"
        }, test.joust(new String[] {
                "$->  ",
                "  <-P"
        }, 3,3));
        assertArrayEquals(new String[] {
                "$->",
                "<-P"
        }, test.joust(new String[] {
                "$->",
                "<-P"
        }, 3,3));
        assertArrayEquals(new String[] {
                "$-> ",
                " <-P"
        }, test.joust(new String[] {
                "$-> ",
                " <-P"
        }, 0,0));
    }

    @Test
    void knightsRefusedToFight() {
        assertArrayEquals(new String[] {
                "$->    ",
                "    <-P"
        }, test.joust(new String[] {
                "$->    ",
                "    <-P"
        }, 0,0));
    }

}