package main.kyu6;

public class kingdomsEp1 {
    public static String[] joust(String[] listField, int vKnightLeft, int vKnightRight) {
        StringBuilder leftKnight = new StringBuilder(listField[0]);
        StringBuilder rightKnight = new StringBuilder(listField[1]);
        int indexOfLancaLeft = leftKnight.indexOf(">"), indexOfLancaRight = rightKnight.indexOf("<");

        if (vKnightLeft == 0 && vKnightRight == 0) {
            return new String[] {leftKnight.toString(), rightKnight.toString()};
        }

        while (indexOfLancaLeft < indexOfLancaRight)
        {
            for (int i = 0; i < vKnightLeft; i++) {
                leftKnight.insert(0, " ");
                leftKnight.deleteCharAt(leftKnight.length() - 1);
            }
            for (int i = 0; i < vKnightRight; i++){
                rightKnight.append(" ");
                rightKnight.deleteCharAt(0);
            }

            indexOfLancaLeft = leftKnight.indexOf(">");
            indexOfLancaRight = rightKnight.indexOf("<");
        }

        return new String[]{leftKnight.toString(), rightKnight.toString()};

    }

}
