package main.kyu7;

public class simpleStringChar {
    public static int[] Solve(String word) {
        int upper = word.replaceAll("[^A-Z]", "").length();
        int lower = word.replaceAll("[^a-z]", "").length();
        int number = word.replaceAll("[^0-9]", "").length();
        int special = word.replaceAll("[\\w]", "").length();

        return new int[]{upper, lower, number, special};
    }
}
