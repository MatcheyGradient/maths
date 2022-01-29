package math;

public class Numbers {

    public static int factorNumber(int number){
        int store = 1;
        for(int i = number; i > 0; i--){
            store = store * i;
        }

        return store;
    }
}
