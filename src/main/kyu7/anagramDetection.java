package main.kyu7;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class anagramDetection {

    public static boolean isAnagram(String test, String original) {
        String sortedTest = Stream.of(test.toLowerCase().split("")).sorted().collect(Collectors.joining());
        String sortedOriginal = Stream.of(original.toLowerCase().split("")).sorted().collect(Collectors.joining());

        if (sortedTest.equals(sortedOriginal)) {
            return true;
        }
        return false;
    }
}
