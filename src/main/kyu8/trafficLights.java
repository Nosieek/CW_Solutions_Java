package main.kyu8;

import java.util.HashMap;
import java.util.Map;

public class trafficLights {
    public static String updateLight(String current) {
        Map<String, String> light = new HashMap();
        light.put("green", "yellow");
        light.put("yellow", "red");
        light.put("red", "green");
        return light.get(current);
    }
}
