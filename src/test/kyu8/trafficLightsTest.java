package test.kyu8;

import org.junit.jupiter.api.Test;
import main.kyu8.trafficLights;

import static org.junit.jupiter.api.Assertions.*;

class trafficLightsTest {

    @Test
    void updateLight() {
        assertEquals("green", trafficLights.updateLight("red"));
        assertEquals("yellow", trafficLights.updateLight("green"));
        assertEquals("red", trafficLights.updateLight("yellow"));
    }
}