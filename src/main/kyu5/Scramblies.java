package main.kyu5;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if(str2.length() > str1.length()){
            return false;
        }

        for(String ourLetter: str2.split("")){
            if(!str1.contains(ourLetter)){
                return false;
            }
            str1 = str1.replaceFirst(ourLetter,"");
        }
        System.out.println(str1);

        return true;
    }
}

