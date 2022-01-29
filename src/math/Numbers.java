package math;

public class Numbers {

    public static long factorNumber(int number){
        long store = 1;
        for(int i = number; i > 0; i--){
            store = store * i;
        }
        return store;
    }

    public static long[] fibonacci(int seed1, int seed2, int length){ // breaks at a length of 93 (too big)
        long[] series = new long[length];

        long a = seed1;
        long b = seed2;
        
        for(int i = 0; i < length; i++){
            long c = a + b;

            series[i] = a;

            a = b;
            b = c;
        }


        return series;
    }
}
