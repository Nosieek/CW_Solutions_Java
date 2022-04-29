package main.kyu5;

public class trallingZerosOfN {
    public static int zeros(int n) {
        int counterZeros = 0;
        for(int i = 5; i <= n; i *= 5){
            counterZeros += n / i;
        }
        return counterZeros;
    }
}
