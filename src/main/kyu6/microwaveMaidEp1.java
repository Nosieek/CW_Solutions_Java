package main.kyu6;

public class microwaveMaidEp1 {
    public String getBestCombination(int time) {
        int minute = time / 60;
        int seconds = time % 60;

        if (counter(firstMethod(minute,seconds)) == counter(secondMethod(minute, seconds)))
        {
            return shortest(firstMethod(minute,seconds), secondMethod(minute, seconds));

        }else if(counter(firstMethod(minute,seconds)) < counter(secondMethod(minute, seconds))){

            return firstMethod(minute,seconds);

        }else if(secondMethod(minute, seconds).length() > 4) {

            return firstMethod(minute,seconds);

        }
        return secondMethod(minute, seconds);
    }

    private String firstMethod(int minute, int seconds) {
        return String.format("%d%02d", minute, seconds).replaceAll("^0+", "");
    }

    private String secondMethod(int minutes, int seconds) {
        return String.format("%d%02d", minutes - 1, seconds + 60).replaceAll("^0+", "");
    }
    private String shortest(String ourNum, String otherNum){
        return otherNum.length() < ourNum.length() ? otherNum : ourNum;
    }


    private int counter(String ourNumber) {
        int counter = 1;
        for (int i = 1; i < ourNumber.length(); i++) {
            if (!(ourNumber.charAt(i) == ourNumber.charAt(i - 1))) {
                counter++;
            }
        }
        // System.out.println(counter);
        return counter;
    }

}

